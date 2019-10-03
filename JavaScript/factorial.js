//Takes input 'number' and returns factorial of that number.

 const factorial = (number) => {
  if (number === 0) {
    return 1;
  } else {
    return number * factorial(number-1);
  }
 }
