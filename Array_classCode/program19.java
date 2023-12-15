//program 19 (optimized solution)


import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter elements ");
		char arr[] = new char[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		int count = 0;
		int aCount = 0;
	
		for (int i = 0;i<size;i++){
			if (arr[i]=='a'){
				aCount++;
		          
			}
			else if(arr[i]=='g' && aCount >0 ){
				count = count +aCount;
			}
		}
		System.out.println("Count: "+count);





		}
}

