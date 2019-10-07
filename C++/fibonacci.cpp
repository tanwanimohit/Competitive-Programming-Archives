#include <iostream>

void PrintFib(uint32_t nums) {
    uint32_t n0 = 0;
    uint32_t n1 = 1;
    for (int i = 0; i < nums; i++) {
       if (i == 0) {
           std::cout << n0 << ", ";
           continue;
       }
       if (i == 1) {
           std::cout << n1 << ", ";
           continue;
       }
       else {
           uint32_t next = n0 + n1;
           n0 = n1;
           n1 = next;
           if (i == (nums-1)) {
               std::cout << next << std::endl;
           } else {
               std::cout << next << ", ";
           }
       }
    }
}

int main() {
    uint32_t nums = 20;
    std::cout << nums << " digit fibonacci Sequence:" << std::endl;
    PrintFib(20);
}

