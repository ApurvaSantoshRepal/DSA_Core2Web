

import java.io.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
         int result[] = new int [2];
         for (int i=0;i<nums.length;i++) {
             for(int j=i+1;j<nums.length;j++){
                 if (nums[i]+nums[j]==target){
                    
                      result[0]=i;
                      result[1]=j;
                       
                 }
             }
         }
         return result;  
        
    }
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter  Size of Array");

    int size = Integer.parseInt(br.readLine());
    int nums[] = new int[size];
    System.out.println("Enter target");
    int target = Integer.parseInt(br.readLine());
    System.out.println("Enter Elements in Array");
    for(int i =0;i<nums.length;i++){
        nums[i]=Integer.parseInt(br.readLine());
    }
    Solution obj = new Solution();

    int result[] = obj.twoSum(nums , target);
    System.out.println("["+result[0]+","+result[1]+"]");
    
    }
}

