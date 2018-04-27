public class recitation5{
	public static void main(String[] args){
    System.out.println("How many numbers do you want to sum?: ");
    int num = IO.readInt();
    int sum = 0;
    int i = 1;
    // for (int i = 1; i <= num; i++){
    //   sum += i;
    // }
    while (i <= num){
      sum += i;
      i++;
    }
    IO.outputIntAnswer(sum);
  }
}

public class recitation5{
  public  static void main(String[] args){
    System.out.println("How many test scores do you want to average?: ");
    double numOfTests = IO.readDouble();
    double sum = 0.0;
    int i = 1;
    while (i <= numOfTests){
      System.out.println("Input test score: ");
      double testScore = IO.readDouble();
      sum += testScore;
      i++;
    }
    double avg = sum / numOfTests;
    IO.outputDoubleAnswer(avg);
  }
}

public class recitation5{
  public static void main(String[] args){
    System.out.println("How many numbers?");
    int numbers = IO.readInt();
    System.out.println("Input the first number?");
    int max = IO.readInt();
    for (int i = 0; i<numbers; i++){
      System.out.println("Input the next number?");
      int currentNum = IO.readInt();
      if (max <= currentNum){
        max = currentNum;
      }
    }
    IO.outputIntAnswer(max);
  }
}
