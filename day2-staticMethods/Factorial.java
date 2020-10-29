public class Factorial {

  public static int factorialWithRecursion(int number) {
    if (number == 1) {
      return number;
    }
    return number * factorial(number - 1);
  }

  public static int factorial(int number) {
    int fact = 1;
    for (int i = 1; i <= number; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No arguments given !");
      return;
    }

    int number = Integer.parseInt(args[0]);
    System.out.println(factorial(number));
    System.out.println(factorialWithRecursion(number));
  }
}
