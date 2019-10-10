/*
This function is returning true if the num(parameter) is 
divisible by divisor(parameter) provided in the function

e.g: isDivisor(10, 2) // true
    because 10 / 2 === 5

e.g: isDivisor(10, 3) // false
    because 10 / 3 === 3.3333
*/

function isDivisor(num, divisor){
	return (num % divisor) === 0;
}