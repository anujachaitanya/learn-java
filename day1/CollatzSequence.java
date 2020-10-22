public class CollatzSequence {

  public boolean isEven() {
    return false;
  }

  public static boolean isOdd() {
    return !isEven();
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments");
      return;
    }
    isOdd();
    int number = Integer.parseInt(args[0]) << 1;
    while (number != 1) {
      number = number % 2 == 0 ? (number / 2) : (3 * number) + 1;
      System.out.println(number);
    }
  }
}
