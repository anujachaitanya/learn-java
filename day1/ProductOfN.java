public class ProductOfN {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Arguments required ");
      return;
    }
    int number = Integer.parseInt(args[0]);
    int product = 1;

    for (int i = 1; i <= number; i++) {
      product *= i;
    }
    System.out.println(product);
  }
}
