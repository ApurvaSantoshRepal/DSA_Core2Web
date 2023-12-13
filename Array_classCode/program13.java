// rotation of array towords right
//
//
import java.io.*;
class ArrayRotaton {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		for(int i = 0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter value of steps move towords right: ");
		int move = Integer.parseInt(br.readLine());
		int output[] = arrayRotation(arr,move);
		for(int i=0;i<output.length;i++){
			System.out.print(output[i]+" ");
		}
		System.out.println();
	}
        static int[] arrayRotation(int arr[] , int move){

		move = move%arr.length;
		for(int i=1;i<=move;i++){
			int lastIndex = arr[arr.length-1];
			for(int j=arr.length-1;j>=1;j--){
				arr[j]=arr[j-1];
			}
			arr[0]=lastIndex;
		}
		return arr;

	}
}

