from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
from PIL import Image
import io
from pytesseract import image_to_string as its


isbn = '9788575227183'
options = webdriver.ChromeOptions()
##options.add_argument('headless')
options.add_argument('window-size=1920x1080')
driver = webdriver.Chrome(executable_path='chromedriver.exe', 
chrome_options=options)
stop = True


def getAndSend():
    driver.get("http://www.isbn.bn.br/website/consulta/cadastro")
    time.sleep(2)
    driver.find_element_by_id('campo').send_keys('1')
    driver.find_element_by_id('valor').send_keys(isbn)
    image = driver.find_element_by_id('idImgCaptcha').screenshot_as_png
    data = io.BytesIO(image)
    img = Image.open(data)
    cap = its(img)
    driver.find_element_by_id('imagemCaptcha').send_keys(cap.replace(' 
', '').lower())
    driver.find_element_by_id('btnConsultar').click()

def isPresence():
    driver.find_element_by_xpath('//div[@class="conteudo"]/div[3]')
    
while stop:
    getAndSend()
    try:
        isPresence()
        
print(driver.find_element_by_xpath('//div[@class="conteudo"]').text)
        stop = False
        driver.quit()
    except:
        pass
    


