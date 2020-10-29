public class CollatzSequence {

  public static boolean isEven(int number) {
    return number % 2 == 0;
  }

  public static void printCollatz(int number) {
    while (number != 1) {
      if (isEven(number)) {
        number = number / 2;
      } else {
        number = (3 * number) + 1;
      }
      System.out.println(number);
    }
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments");
      return;
    }
    int number = Integer.parseInt(args[0]) << 1;
    printCollatz(number);
  }
}
