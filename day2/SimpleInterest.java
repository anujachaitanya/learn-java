public class SimpleInterest {

  public static double getSI(int principal, int rate, int period) {
    return (principal * rate * period) / 100.0;
  }

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    int principal = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    double simpleInterest = getSI(principal, rate, period);

    System.out.println("Simple interest is " + simpleInterest);
  }
}
