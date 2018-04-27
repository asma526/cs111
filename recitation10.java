public class recitation10{
  //main
  public static void main(String[] args){
    int[] list1 = {1,2,3};
    int[] list2 = {2,3,4};
    duplicate(list1,list2);

    int[][] grade = {{1,1,1},
                     {2,2,2},
                     {3,3,3}};
    studentsPassed(grade);
  }
  //exercise 1
  public static void duplicate(int[] arr1, int[] arr2){
    for (int i = 0; i < arr1.length; i++){
      for (int j = 0; j < arr2.length; j++){
        if (arr1[i] == arr2[j]){
          System.out.println(arr1[i]);
        }
      }
    }
  }
  //exercise 2
  public static void studentsPassed(int[][] grades){
    for (int i = 0; i < grades.length; i++){
      int sum = 0;
      int min = grades[i][0];
      for (int j = 0; j < grades[i].length; j++){
        if (grades[i][j] < min){
          min = grades[i][j];
        }
        sum += grades[i][j];
      }
      sum -= min;
      double avg = sum/(grades[i].length-1.0);
      if (avg >= 70){
        System.out.println("Sudent "+(i+1)+" passed the class with an average of "+avg);
      }
    }
  }
  //exercise 3
  public static void rotateArray(int[][] arr){
    for(int i = 0; i<arr.length; i++){
      for(int j=0; j<arr[i].length/2;j++){
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr[i].length-j-1];
        arr[i][arr[i].length-j-1] = temp;
      }
    }

    for(int i = 0; i<arr.length/2; i++){
      int[] temp = arr[i];
      arr[i] = arr[arr.length-i-1];
      arr[arr.length-i-1] = temp;
    }
  }

}
