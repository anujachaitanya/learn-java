public class Characters {

  public static boolean areEqual(char[] array1, char[] array2) {
    if (array1.length != array2.length) {
      return false;
    }

    for (int index = 0; index < array1.length; index++) {
      if (array1[index] != array2[index]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    char[] array1 = { 'a', 'b', 'c' };
    char[] array2 = { 'a', 'b', 'c' };

    System.out.println(areEqual(array1, array2));
  }
}
