#include <iostream>
#include <string.h>
#include <stdio.h>

void ReverseString(std::string str) {
    int len = str.length();
    for(int i = len; i >= 0; i--) {
        std::cout << str[i];
    }
    std::cout << std::endl;
}

int main() {
    std::string s("REVERSE");
    std::cout << "Reversed string:" << std::endl;
    ReverseString(s);
}
