public class MatrixOps{

  public static void main(String[] args){
    double[][] matrix1 = {{1,2},{3,4},{5,6}};
    double[][] matrix2 = {{7,8,9},{10,11,12}};
    System.out.println(multiply(matrix1,matrix2));
  }

  public static double[][] multiply(double[][] A, double[][] B){
    double[][] result = new double[A.length][B[0].length];

    if (A[0].length != B.length){
      return null;
    }

    for (int i = 0; i < A.length; i++){
      for (int j = 0; j < B[0].length; j++){
        for (int k = 0; k < A[0].length; k++){
          result[i][j] += A[i][k] * B[k][j];
        }
      }
    }

    return result;

  }

}
