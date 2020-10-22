public class Factorial {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No arguments given !");
      return;
    }

    int number = Integer.parseInt(args[0]);
    int fact = 1;
    for (int i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println(fact);
  }
}
