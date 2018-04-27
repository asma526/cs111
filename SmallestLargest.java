public class SmallestLargest
{
	public static void main(String[] args)
	{
		System.out.println("Please provide a terminating value (real number):");
			double term = IO.readDouble();

		System.out.println("Please provide a real number:");
			double realNum = IO.readDouble();

			double small = realNum;
			double large = realNum;
			int x = 0;

		while(realNum != term)
		{
		System.out.println("Please provide a real number:");
			realNum = IO.readDouble();

			if(realNum != term && realNum > large)
			{
				large = realNum;
			}

			if(realNum != term && realNum < small)
			{
				small = realNum;
			}

			x++;
		}

		if(x < 2)
		{
			IO.reportBadInput();
			System.exit(0);
		}

		System.out.println("Smallest number");
		IO.outputDoubleAnswer(small);

		System.out.println("Largest number");
		IO.outputDoubleAnswer(large);
	}
}
