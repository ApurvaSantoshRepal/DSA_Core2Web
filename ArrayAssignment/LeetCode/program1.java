import java.util.*;
class Solution {
    static  int reverse(int x) {
        int temp = x;
        
        long num = 0;
        while(temp!=0)
        {
            int rem= temp%10;
           
           
            num=(num*10)+rem;
           
            temp=temp/10;
        }
          if(num > Integer.MAX_VALUE || num<Integer.MIN_VALUE){
            return 0;
        }
       
        return (int)num;
    }
    public static void main(String[] args){
	    Scanner sc = new Scanner (System.in);
	    int num = sc.nextInt();
	    System.out.println(reverse(num));
    }

}


