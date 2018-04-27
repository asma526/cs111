public class recitation11{

  //exercise 1
  public static int seqSearch(int[] arr, int num){
    int count = 0;
    for (int i=0; i<arr.lenght;i++){
      if (arr[i]==num){
        return i;
      }
    }
    return -1;
  }

  //exercise 2

  arr = [1,2,5,8,15,17] num = 2

  // 1. start in the middle of the array
  // 2. if that value is larger than your value:
  // 3. move to the left and compare values to your value
  // 4. if that value is less than your value:
  // 5. move to the right and compare values to your value
  // 6. if match is found, return index

  //exercise 3

  arr = [15,2,8,1,17,5]

  // 1. search through entire array and look for smallest values
  // 2. Take that value and bring it to the front
  // 3. Search through array (not including first value) and look for smallest value
  // 4. Take that value and place it in front of the array you just searched through
  // 5. Complete until entire array is sorted
}
