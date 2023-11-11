//WAP to reverse the string
//
import java.util.*;

class RecursionDemo{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	
		System.out.println("Reverse string of "+str+" is "+reverseString(str));
	}
	static String  reverseString(String str){
		if (str == null || str.length()<=1){
			return str;
		}
		return reverseString(str.substring(1))+str.charAt(0);
	}

}

