public class ArrayMethods {

  public static boolean includes(int[] numbers, int number) {
    for (int index = 0; index < numbers.length; index++) {
      if (number == numbers[index]) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4 };
    System.out.println(includes(a, 4));
    System.out.println(includes(a, 5));
  }
}
