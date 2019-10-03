package Go

import (
	"bufio"
	"fmt"
	"os"
	"strings"
	"path/filepath"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Insert the path where you want to search:")
	path, _ := reader.ReadString('\n')
	path = strings.Replace(path, "\n", "", -1)
	fmt.Println("Insert the file or part name you want to find:")
	fileName, _ := reader.ReadString('\n')
	fileName = strings.Replace(fileName, "\n", "", -1)
	var patterns []string
	patterns[0] = fileName
	FindFile(path, patterns)
}


func FindFile(targetDir string, pattern []string) {
	foundPath := ""
	for _, v := range pattern {
		matches, err := filepath.Glob(targetDir + v)
		if err != nil {
			fmt.Println(err)
			panic(err)
		}
		if len(matches) != 0 {
			fmt.Println("Found : ", matches)
			foundPath = matches[0]
		}
	}
	fmt.Println("Found : ", foundPath)
}
