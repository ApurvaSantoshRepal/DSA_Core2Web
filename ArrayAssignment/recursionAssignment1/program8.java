//WAP to count the occurance of specific number in given number 
//WAP to count the occurance of specific number in given number 
import java.util.*;
class RecursionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int temp = sc.nextInt();
		System.out.println("count of "+temp +" in "+num+" is "+countOfSpecificNumber(num,temp));
	}
	static int countOfSpecificNumber(int num,int temp){
		if (num/10==0){
			if (num == temp){
				return 1;
			}
			return 0;
		}
		int rem = num%10;
		if (rem==temp){
			return countOfSpecificNumber(num/10,temp)+1;
		}
		else{
			return countOfSpecificNumber(num/10,temp)+0;
		}

	}
}
