//ReverseString using stack

import java.util.*;
class ReverseString{

	String reverseString(String str){
		Stack<Character> s = new Stack<Character>();
		for (int i =0;i<str.length();i++){
			char ch = str.charAt(i);
			s.push(ch);
		}
		char chArray[] = new char[str.length()];
		int i=0;
		while (! s.empty()){
			chArray[i]=s.pop();
			i++;
		}
		return new String(chArray);
	}
}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String str = sc.nextLine();
		ReverseString obj = new ReverseString();
		String reverseString = obj.reverseString(str);
		System.out.println("String After Reverse : "+reverseString);
	}
}


