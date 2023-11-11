//write a program to determine whether a given positive integer is a composite number or not.
import java.util.*;
class RecursionDemo{
	static int count =0;
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int temp=1;
		if (isComposite(num,temp))
			System.out.println(num+" is composite number");
		else{
			System.out.println(num +" is not composite number");
		}
	}
	static boolean isComposite(int num,int temp){
		if (temp==num){
			if (count>2)
				return true;
			else
				return false;

		}
		if (num%temp==0){
			count++;
		}
	        return isComposite(num , temp+1);
	}
}

		

