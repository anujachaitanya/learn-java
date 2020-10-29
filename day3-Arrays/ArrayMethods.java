public class ArrayMethods {

  public static boolean includes(int[] array, int element) {
    for (int index = 0; index < array.length; index++) {
      if (element == array[index]) {
        return true;
      }
    }
    return false;
  }

  public static int findIndex(int[] array, int element) {
    for (int index = 0; index < array.length; index++) {
      if (element == array[index]) {
        return index;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4 };
    System.out.println(includes(a, 4));
    System.out.println(includes(a, 5));

    System.out.println(findIndex(a, 2));
    System.out.println(findIndex(a, 5));
  }
}
