class RecursionDemo{
	public static void main(String[] args){
		printNumber(1);
	}
	static void printNumber(int num){
		if(num==11){
			return ;
		}
		System.out.println(num);
		num++;
		printNumber(num);
	}
}

