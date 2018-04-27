public class WordCount{
  public static void main(String[] args){
		String original = "jjj kk!!  ";
		System.out.println(countWords(original,3));
	}

  public static int countWords ( String original, int maxLength ){
    int letterCount = 0;
    int wordCount = 0;
    for (int i = 0; i < original.length(); i++){
      if (original.charAt(i) != ' ' && Character.isLetter(original.charAt(i)) ){
        letterCount += 1;
      }else{
        if (letterCount <= maxLength && letterCount != 0){
          wordCount += 1;
        }
        letterCount = 0;
      }
    }
    if (letterCount <= maxLength && letterCount != 0){
      wordCount += 1;
    }
    return wordCount;
  }

}
