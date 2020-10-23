public class Factorial {

  public static int fact(int number) {
    if (number == 1) {
      return number;
    }
    return number * fact(number - 1);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No arguments given !");
      return;
    }

    int number = Integer.parseInt(args[0]);
    System.out.println(fact(number));
  }
}
