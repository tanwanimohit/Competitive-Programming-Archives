#include <stdio.h>

int main () {
  int a, b, c, x = 0;
  printf("Type in your 1. number \n");
  scanf("%d", &a);
  printf("Type in your 2. number\n");
  scanf("%d", &b);
  printf("Type in your 3. number\n");
  scanf("%d", &c);
  if (a > c) {
    x = a;
    a = c;
    c = x;
  }
  if (b > c) {
    x = b;
    b = c;
    c = x;
  }
  if (a > b) {
    x = a;
    a = b;
    b = x;
  }
  if (((a < b) && (b < c)) && ((a*a + b*b) == c*c)) {
    printf("%d, %d and %d form a Phytagora triple:\n", a, b, c);
    printf("%d + %d = %d\n", a*a, b*b, c*c);
    return 0;
  }
  printf("%d, %d und %d dont form a Phytagora triple \n", a, b, c);
  return 0;
}
    
