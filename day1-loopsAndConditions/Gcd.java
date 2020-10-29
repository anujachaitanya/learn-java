public class Gcd {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }
    int firstNumber = Integer.parseInt(args[0]);
    int secondNumber = Integer.parseInt(args[1]);
    int gcd = 1;
    int max = firstNumber > secondNumber ? secondNumber : firstNumber;

    for (int i = 1; i <= max; i++) {
      if (firstNumber % i == 0 && secondNumber % i == 0) {
        gcd = i;
      }
    }
    System.out.println(
      "GCD of " + firstNumber + " and " + secondNumber + " is " + gcd
    );
  }
}
