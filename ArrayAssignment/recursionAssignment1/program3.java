

import java.io.*;
class RecursionDemo{
	static int sum = 0;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(printSumOfN(num));
	}
	static int printSumOfN(int num){
		if (num==1){
			return 1;
		}
		 return num + printSumOfN(num-1);
		
	}
}


