
public class InvertedStringUppercase {
    
    public String InvertedString(String st){
        String aux="";
       if(st.length()==0){
           return "Invalid String";
       }else{
           for(int i=st.length()-1;i>=0;i--){
               aux+=st.charAt(i);
           }
       }
       return aux;
    }
}
