public class exam{
	public static void main(String[] args){
    int n = IO.readInt();
    for (int i = 0; i<n;i++){
      for (int x=0;x<i;x++){
        System.out.print("-");
      }
      for (int j=(i-1);j>0;j--){
        System.out.print("+");
      }
      System.out.println(" ");
    }
  }
}
