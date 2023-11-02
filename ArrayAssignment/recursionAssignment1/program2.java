class RecursionDemo{
	public static void main(String[] args){
		printNumbers(1);

	}
	static void printNumbers(int num){
		if(num==11)
			return;
		printNumbers(num+1);
		System.out.println(num);
	}
}
