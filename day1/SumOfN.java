public class SumOfN {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Arguments required ");
      return;
    }
    int number = Integer.parseInt(args[0]);
    int sum = 0;
    for (int i = 0; i <= number; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
