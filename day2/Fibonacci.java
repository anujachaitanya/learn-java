public class Fibonacci {

  public static void printFibonacci(int limit, int currentTerm, int nextTerm) {
    if (limit == 0) {
      return;
    }

    System.out.println(currentTerm);
    printFibonacci(limit - 1, nextTerm, nextTerm + currentTerm);
  }

  public static void fibonacci(int noOfTerms) {
    int current = 0, next = 1;

    for (int i = 0; i < noOfTerms; i++) {
      System.out.println(current);
      next = current + next;
      current = next - current;
    }
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments");
      return;
    }

    int noOfTerms = Integer.parseInt(args[0]);
    printFibonacci(noOfTerms, 0, 1);
    fibonacci(noOfTerms);
  }
}
