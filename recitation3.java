import java.lang.Math;

public class recitation3 {
  public static void main(String[] args) {

    double degrees = IO.readDouble("Enter a degree value: ");

    double sinOfAngle = Math.sin(degrees);
    double cosOfAngle = Math.cos(degrees);
    double tanOfAngle = Math.tan(degrees);

    System.out.println(sinOfAngle);
    System.out.println(cosOfAngle);
    System.out.println(tanOfAngle);
  }

}
