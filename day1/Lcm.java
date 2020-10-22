public class Lcm {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }
    int firstNumber = Integer.parseInt(args[0]);
    int secondNumber = Integer.parseInt(args[1]);
    int max = firstNumber > secondNumber ? secondNumber : firstNumber;
    int gcd = 1;

    for (int i = 1; i <= max; i++) {
      if (firstNumber % i == 0 && secondNumber % i == 0) {
        gcd = i;
      }
    }

    int lcm = (firstNumber * secondNumber) / gcd;
    System.out.println(
      "Lcm of " + firstNumber + " and " + secondNumber + " is " + lcm
    );
  }
}
