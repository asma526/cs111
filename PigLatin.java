public class PigLatin{
  public static void main(String[] args){
		String original = "Poop";
		System.out.println(translate(original));
	}

  public static String translate ( String original ){
    original = original.toLowerCase();
    if ('a' == original.charAt(0)){
      original += "vai";
    }else if ('e' == original.charAt(0)){
      original += "vai";
    }else if ('i' == original.charAt(0)){
      original += "vai";
    }else if ('o' == original.charAt(0)){
      original += "vai";
    }else if ('u' == original.charAt(0)){
      original += "vai";
    }else{
      char consonant = original.charAt(0);
      original = original.substring(1) + consonant + "ai";
    }

    return original;

  }
}
