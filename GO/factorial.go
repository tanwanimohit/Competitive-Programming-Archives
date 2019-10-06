package main

import "fmt"

func main() {

	for a := 1; a <= 10; a++ {
		fmt.Println(a," factorial is", factorial(a))
	}
}

func factorial(number int) int {
	var result int = 1

	for i := 1; i <= number; i++ {
		result = result * i
	}

	return result
}
