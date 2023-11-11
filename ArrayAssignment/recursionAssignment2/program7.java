//Write a program to check if given number is a Magic Number or not (A Magic Number is a number in which the evaluate sum of digits is equal to 1)
import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		boolean output = isMagicNumber(num);
		if(output){
			System.out.println(num+" is a magic number ");
		}
		else{
			System.out.println(num+" is not a magic number ");
		}



	}
	static boolean isMagicNumber(int num){
		if(num<=9){
			return num==1;
		}
		else{
			int sum = countDigits(num);
			return isMagicNumber(sum);
		}
	}
	static int countDigits(int num){
		if (num==0){
			return 0;
		}
		int rem = num%10;
		return rem+countDigits(num/10);
	}


}
