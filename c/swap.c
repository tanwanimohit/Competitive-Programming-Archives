#include <stdio.h>

void swap(int *a, int *b, int *c) {
  int tmp;
  tmp = *c;
  *c = *a;
  *a = *b;
  *b = tmp;
}

int main () {
  int a , b, c;
  int *a1, *b1, *c1; 
  printf("Please type in 3 integers: \n");
  scanf("%d", &a);
  scanf("%d", &b);
  scanf("%d", &c);
  a1 = &a;
  b1 = &b;
  c1 = &c;
  printf("a = %d, b = %d, c = %d\n", *a1, *b1, *c1);
  swap(a1,b1,c1);
  printf("a = %d, b = %d, c = %d\n", *a1, *b1, *c1);
  return 0;
}
