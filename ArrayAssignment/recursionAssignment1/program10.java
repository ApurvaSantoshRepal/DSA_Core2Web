//WAP to check whether the give number is palindrom or not 
import java.util.*;
class RecursionDemo{
	static int finalNo = 0;
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	isPalindromNo(num);
	if (finalNo==num){
		System.out.println(num +" is Palindrom no");

	}
	else{
		System.out.println(num + " is not Palindrom no");
	}
	}
	static void isPalindromNo(int num){
		if (num/10==0){
			finalNo=(finalNo*10)+num%10;
			return;
		}


		int rem = num%10;
		finalNo=finalNo*10+rem;
		isPalindromNo(num/10);
	}
}

