/*Problem Statement : Read a string from the user and written in zig-zag fashion based on the number of rows read by the user.
 * Then read the zig-zag string line by line. That's all you are done.
 *
 * Example:
 * INPUT:
 * 	str="PAYPALISHIRING"
 *	rows=3
 *
 *	written in zig-zag fashion
 *
 *   P     A     H      N
 *    A   P  L  S  I   I  G
 *	Y     I      R
 *
 *OUTPUT:
 	result="PAHNAPLSIIGYIR"
 */

#include<bits/stdc++.h>
using namespace std;

string convert(string s, int numRows) {
        
        //store the sting in matix wise
        string result[numRows];
        string ans;
        //corner case
        if(numRows==1)
            return s;
        
        
        //2 variables down,row
        //down-> direction
        //row -> traversing
        bool down=true;
        int row=0;
        
        //traverse the string
        // if row==0 then down = true
        // if row == size - 1 then down=false
            
        for(int i=0;i<s.length();i++)
        {
            result[row].push_back(s[i]);
            if(row==0)
                down=true;
            
            else if(row==numRows-1)
                down = false;
            
            down ? row++ : row--;
            
        }
        //appending these result[0],result[1],result[2]....result[numRows-1]
        //we get the final result
        for(int i=0;i<numRows;i++)
            ans+=result[i];
        return ans;
        
    }

int main(){
	int rows;
	string str;
	cout<<"Enter the word."<<endl;
	cin>>str;
	cout<<endl;
	cout<<"How many rows you want ?"<<endl;
	cin>>rows;
	
	string result=convert(str,rows);
	cout << " Result after zig-zag conversion : "<<result<<endl;
	return 0;
}
