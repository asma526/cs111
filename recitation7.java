public class recitation7 {
  public static void main(String [] args){
    System.out.println(palindrome("racecar"));
  }
  public static boolean palindrome(String word){
    for (int i = 0; i < word.length() / 2; i++){
      for (int j = word.length()-1; j > word.length() / 2; j--){
        if (word.charAt(i) != word.charAt(j)){
          return false;
        }
      }
    }
    return true;
  }
}
