//Write a program to check whether a given number is Strong number or not
import java.util.*;
class RecursionDemo{
      static int strongNum=0;
      public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      int num=sc.nextInt();
	      isStrongNum(num);
	      if(strongNum==num){
		      System.out.println(num+" is Strong num");
	      }
	      else{
		      System.out.println(num+" is not Strong num");
	      }
      }
      static void isStrongNum(int num){
	      if (num==0){
		      return;
	      }
	      int rem= num%10;
	      int fact=factorial(rem);
	      strongNum=strongNum+fact;
	      isStrongNum(num/10);
      }
      static int factorial(int num){
	      if (num==0)
		      return 1;
	      return num*factorial(num-1);
      }
}

