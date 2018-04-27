public class TwoSmallest{
  public static void main(String [] args){

	int x = 0;

  System.out.println("Enter terminating value");
	double term = IO.readDouble();
	x++;

	double num = IO.readDouble();
	double smallest, secondSmallest;
	if(num != term){
    smallest = num;
	  secondSmallest = num;
	  x++;
	}else{
    do{
      IO.reportBadInput();
      num = IO.readDouble();
		}while(num == term);
    smallest = num;
	  secondSmallest = num;
	  x++;
	}

	num = IO.readDouble();

	if(num==term){
    do{
      IO.reportBadInput();
		  num = IO.readDouble();
	  }while(num==term);
    x++;
	}
	else
	  x++;

	if(num < smallest){
	    double temp = smallest;
	    smallest = num;
	    secondSmallest = temp;
	}
	else
    secondSmallest = num;

	if(x == 3){
    num = IO.readDouble();
	  while(num != term){
		if(num < smallest){
      double temp = smallest;
		  smallest = num;
		  secondSmallest = temp;
		}
		else{
      if(num < secondSmallest)
        secondSmallest = num;
		}
		num = IO.readDouble();
	  }
	}

	else
    System.out.println("FATAL ERROR");

	IO.outputDoubleAnswer(smallest);
	IO.outputDoubleAnswer(secondSmallest);

  }
}
