public class Fibonacci {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments");
      return;
    }
    int noOfTerms = Integer.parseInt(args[0]);
    int current = 0, next = 1;

    for (int i = 0; i < noOfTerms; i++) {
      System.out.println(current);
      next = current + next;
      current = next - current;
    }
  }
}
