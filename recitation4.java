// public class recitation4 {
//   public static void main(String[] args) {
//     System.out.print("How old are you? ");
//     int age = IO.readInt();
//     if (age >= 18) {
//       System.out.println("Yes, you can vote");
//     } else {
//       System.out.println("No, you cant vote");
//     }
//   }
// }

// public class recitation4 {
//   public static void main(String[] args) {
//     System.out.print("Enter an integer: ");
//     int num1 = IO.readInt();
//     System.out.print("Enter another integer: ");
//     int num2 = IO.readInt();
//     if (num1 > 10 || num2 > 10){
//       System.out.println(num1+num2);
//     } else{
//       System.out.println(num1*num2);
//     }
//   }
// }

public class recitation4 {
  public static void main(String[] args) {
    System.out.print("Speed of car: ");
    int speed = IO.readInt();
    if (speed <= 60){
      System.out.println("No fine");
    } else if (speed > 60 && speed <= 75){
      System.out.println("$100 fine");
    } else if (speed > 75 && speed <= 90){
      System.out.println("$200 fine");
    } else{
      System.out.println("$500 fine");
    }
  }
}
