//Given an char array (lowercase) return the count of pain (i,j) such that 
//a)i<j
//arr[i]='a'
//arr[j]='g'
//arr={a,b,e,g,a,g}
//output 3

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char arr[] = new char[]{'a','b','e','g','a','g'};
		int size = arr.length;
		int count = 0;
		for (int i= 0;i<size-1;i++){
			for (int j = i+1;j<size;j++){
				if (arr[i]=='a' && arr[j]=='g'){
					count++;
				}
			}
		}
		System.out.println("Count: "+count);
	}
}

