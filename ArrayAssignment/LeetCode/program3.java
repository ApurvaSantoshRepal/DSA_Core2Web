
import java.util.*;
class Solution {
    static  int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;

            }
            else if(nums[mid]<target){
                
                start = mid+1;
            }
            else {
                
                end = mid-1;
            }
        

        }
        return start;
        
    }
    public static void main(String[] args){
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter size of array");
	    int size = sc.nextInt();
	    System.out.println("Enter element:");
	    int arr[] = new int [size];
	    for (int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter target:");
	    int target = sc.nextInt();
	    System.out.println(searchInsert(arr,target));
    }

}
