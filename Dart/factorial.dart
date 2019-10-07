void main() {
  const number = 3;
  final result = factorial(number);
  
  print(result);
}

num factorial(num number) {
  if (number == 0) {
    return 1;
  }
  
  return number * factorial(number - 1);
}
