//wap  to print length of digis in a number


import java.util.*;

class RecursionDemo{

	public static void main(String[] args){

	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
 int output= lengthOfDigitsInNumber(num);
	System.out.println(output);
	}
	static int   lengthOfDigitsInNumber(int num ){
		if (num/10==0){
			
		         return 1;
		}
		
	        return lengthOfDigitsInNumber(num/10)+1;
		

	}
}
