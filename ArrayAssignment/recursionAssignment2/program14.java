//Write a program to determine whether a given positive integer is an automorphic number or not (An automorphic number (also known as circular number )is number whose square ends with the same digits as number itself )


import java.util.Scanner;

 
class AutomorphicNumber{
	public static void main(String[] args){
 

        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }

    public static boolean isAutomorphic(int number) {
        if (number == 0) {
            return true;
        }

        int square = number * number;

        if (number % 10 != square % 10) {
            return false;
        }

        return isAutomorphic(number / 10) && isAutomorphic(square / 10);
    }
}
