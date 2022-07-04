import java.util.Arrays;
public class Main{
  public static void main(String[] args) {
    int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int k = 4;
    System.out.println("rotate array " + Arrays.toString(input)
        + " by 4 places to the left.");
    int[] rotatedArray = rotateLeft(input, input.length, k);
    System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
    System.out.println("Rotate given array " + Arrays.toString(input)
        + " by 4 places to the right.");
    rotatedArray = rotateRight(rotatedArray, rotatedArray.length, k);
    System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
  }

  // you can rotate array by left 
  private static int[] rotateLeft(int[] input, int length, int numOfRotations) {
    for (int i = 0; i < numOfRotations; i++) {
      int temp = input[0];
      for (int j = 0; j < length - 1; j++) {
        input[j] = input[j + 1];
      }
      input[length - 1] = temp;
    }
    return input;

  }
// you can rotate array by right 
  private static int[] rotateRight(int[] input, int length, int numOfRotations) {
    for (int i = 0; i < numOfRotations; i++) {
      int temp = input[length - 1];
      for (int j = length - 1; j > 0; j--) {
        input[j] = input[j - 1];
      }
      input[0] = temp;
    }
    return input;

  }

}
