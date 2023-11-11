//Write a program to check whether number is prime or not 
//
import java.util.*;
class RecursionDemo{
	static int count = 1;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean output = isPrime(num , 1 );
		if (output){
			System.out.println(num+" Number is not prime Number ");
		}
		else{
			System.out.println(num+" Number is prime Number");
		}




	}
	static boolean isPrime(int num , int temp){
		if (temp*temp > num){
			if (count >2){
				return true;
			}
			else{
				return false;
			}
		}
		if (num % temp ==0){
			count++;
		}
		return isPrime(num , temp+1);


	}

}
