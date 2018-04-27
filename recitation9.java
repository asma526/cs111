public class recitation9{

  public static void main(String[] args){
    reverseString("Puppies");
    int[] myList = {1,2,3};
    avg(myList);
  }
  //excercise 2:
  public static void reverseString(String word){
    char[] arr = word.toCharArray();

    for (int i = arr.length-1; i>=0; i--){
      System.out.println(arr[i]);
    }
  }
  //excercise 3:
  public static void avg(int[] nums){
    int sum = 0;
    for (int i = 0; i<nums.length; i++){
      sum += nums[i];
    }
    double average = (double)sum/nums.length;
    System.out.println(average);
  }

}
