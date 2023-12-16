//Implement Stack using collection


import java.util.*;
class StackDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		System.out.println("Enter Size of Stack");
		int size = sc.nextInt();
		System.out.println("Enter Elemnts in stack : ");
		for (int i=1;i<=size;i++){
			s.push(sc.nextInt());
		}
		System.out.println(s);

		System.out.println(s.pop());
		System.out.println("peek element : "+s.peek());
		System.out.println(s);
		System.out.println("Empty : "+s.empty());
		System.out.println(s);

	}
}

