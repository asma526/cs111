public class Sum{
	public static void main(String[] args){
		// System.out.println("Enter a number: ");
		// int a = IO.readInt();
		//
		// System.out.println("Enter another number: ");
		// int b = IO.readInt();
		//
		// int sum = a + b;
		// IO.outputIntAnswer(sum);	

		System.out.println(Sums(IO.readInt(),IO.readInt(),IO.readInt()));

	}
	public static int Sums(int a, int b, int c){
		int sum = a+b+c;
		return sum;
	}
}
