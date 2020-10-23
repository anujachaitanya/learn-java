public class Fibonacci {

  public static int fibonacci(int term) {
    if (term <= 1) {
      return term;
    }
    return fibonacci(term - 1) + fibonacci(term - 2);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments");
      return;
    }

    int noOfTerms = Integer.parseInt(args[0]);

    for (int term = 0; term < noOfTerms; term++) {
      System.out.println(fibonacci(term));
    }
  }
}
