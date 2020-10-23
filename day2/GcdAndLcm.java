public class GcdAndLcm {

  public static int gcd(int firstNumber, int secondNumber) {
    int result = 1;
    int max = Math.max(firstNumber, secondNumber);

    for (int i = 1; i <= max; i++) {
      if (firstNumber % i == 0 && secondNumber % i == 0) {
        result = i;
      }
    }
    return result;
  }

  public static int lcm(int firstNumber, int secondNumber) {
    int lcm = (firstNumber * secondNumber) / gcd(firstNumber, secondNumber);
    return lcm;
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }
    int firstNumber = Integer.parseInt(args[0]);
    int secondNumber = Integer.parseInt(args[1]);

    System.out.println("GCD is " + gcd(firstNumber, secondNumber));
    System.out.println("LCM is " + lcm(firstNumber, secondNumber));
  }
}
