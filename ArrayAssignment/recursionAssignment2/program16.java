/*
Q16.
Write a program that determines whether a given number is a cube number or not.

(A cube number is defined as a number that is the cube of an integer.)

*/

import java.util.Scanner;

class RecursionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int num = sc.nextInt();

       int temp =1;
        if (isCubeNumber(num,temp)) {
            System.out.println(num + " is a cube number.");
        } else {
            System.out.println(num + " is not a cube number.");
        }

    }

    
    static boolean isCubeNumber(int num,int temp) {
        int cube=temp*temp*temp;
        if(num==cube)
		return true;
	else if(cube>num)
		return false;
	else
		return isCubeNumber(num,temp+1);
    }
}
