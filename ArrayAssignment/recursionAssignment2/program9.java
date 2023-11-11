//Write a program to determine whether a given number is happy number or not (A Happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digits)


import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Set<Integer> hs= new HashSet<Integer>();
		boolean output = isHappy(num , hs);
		if(output){
			System.out.println(num +" is Happy Number ");
		}
		else{
			System.out.println(num+" is not happy number" );
		}
	}
	static boolean isHappy(int num , Set<Integer>hs){
		if (num==1){
			return true;
		}
		if (!hs.add(num)){
			return false;
		}
		int sum = sumOfSquare(num);
		return isHappy(sum,hs);
	}
	static int sumOfSquare(int num){
		if (num==0){
			return 0;
		}
		else{
			return (num%10)*(num%10)+sumOfSquare(num/10);
		}
	}
}

