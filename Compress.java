public class Compress{
	public static void main(String[] args){
		String original="qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
		System.out.println(compress(original));
	}
	public static String compress( String original ){
		int counter = 1;
		String imroved = "";

		for(int i=0; i < (original.length()-1); i++){
			if (original.charAt(i) == original.charAt(i+1)){
				counter++;
			}else{
				if (counter == 1){
					imroved += original.charAt(i);
				}else{
					imroved += String.valueOf(counter) + original.charAt(i);
					counter = 1;
				}
			}
		}
		if (counter == 1){
			imroved += original.charAt(original.length()-1);
		}else{
			imroved += String.valueOf(counter) + original.charAt(original.length()-1);
		}

		return imroved;
	}
}
