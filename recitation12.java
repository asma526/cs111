public class recitation12{
  //exercise 1
  public static int factorial(int n){
    if (n == 0 || n == 1){
      System.out.println("base case: returning 1");
      return 1;
    }else{
      System.out.println("recursive step: factorial(" + (n+1) + ")" );
      int recursiveAns = factorial(n-1);
      System.out.println("returning from recurseive step " + n + "; ans: " recursiveAns);
      return n*recursiveAns;
    }
  }
  //exercise 2 (look at picture for ans)
  public static recBinarySearch(int[] arr, int n){
    if (arr.length == 1 || arr.length == 0){

    }else{
      recBinarySearch(arr[arr.length / 2], n);
      if
    }
  }

  //exercise 3
  public static String reverse(String s){
    if (s.length() == 1){
      return s;
    }else{
      return (s.substring(s.length()-1) + reverse(s.substring(0,s.length()-1)));
    }
  }
  
  public static boolean isPalindrome(String s){
    if (s.length() == 1){
      return true;
    }
    if (s.charAt(0) == s.charAt(s.length()-1)){
      return isPal(s.substring(1, s.length()-1));
    }
    return false;
  }
}
