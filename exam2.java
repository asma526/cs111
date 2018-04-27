public class exam2{
  public static String reverse(String original){
    original = original.toLowerCase();
    String reversed = "";

    for (int i = original.length()-1; i>=0; i--){
      reversed += original.charAt(i);
    }

    for(int j=0; j<reversed.length();j++){
      if (reversed.charAt(j) == ' '){
        reversed = reversed.substring(0,j+1) + reversed.substring(j+1,j+2).toUpperCase() + reversed.substring(j+2);
      }
    }
    reversed = reversed.substring(0,1).toUpperCase() + reversed.substring(1);
    return reversed;
  }

  public static void main(String[] args){
    String word = "Hello this is dumb";
    System.out.println(reverse(word));
  }
}
