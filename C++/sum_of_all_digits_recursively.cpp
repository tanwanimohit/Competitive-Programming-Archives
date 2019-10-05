// This program sums all the digits of a number till the number becomes a single digit
// For example NUMBER 3564
// 3+5+6+4 = 28
// 2+8 = 10
// 1+0 = 1

#include<iostream>

using namespace std;

int sum(int a){
	if(a>0){
		return (a%10)+sum(a/10);
	}
	return 0;
}

int sum_all(int a){
	if(a>9){
		a = sum(a);
		return sum_all(a);
	}
	return a;
}

int main(){
	int num, sum;
	cin>>num;
	sum = sum_all(num);
	cout<<"sum : "<<sum<<"\n";
	return 0;
}
