public class Numbers {

  public static int[] repeat(int number, int n) {
    int[] repeated = new int[n];
    for (int i = 0; i < n; i++) {
      repeated[i] = number;
    }
    return repeated;
  }

  public static int findLargest(int[] array) {
    int largest = array[0];
    for (int i = 0; i < array.length; i++) {
      if (largest < array[i]) {
        largest = array[i];
      }
    }
    return largest;
  }

  public static void printArray(int[] array) {
    for (int number : array) {
      System.out.println(number);
    }
  }

  public static void main(String[] args) {
    int[] array = repeat(3, 4);
    int[] a = { 1, 2, 3, 4 };
    printArray(array);
    System.out.println(findLargest(a));
    System.out.println(average(a));
  }
}
