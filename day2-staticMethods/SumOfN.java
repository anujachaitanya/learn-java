public class SumOfN {

  public static int sum(int limit) {
    int sum = 0;
    for (int number = 0; number <= limit; number++) {
      sum += number;
    }
    return sum;
  }

  public static int sumWithRecursion(int number, int sum) {
    if (number == 0) {
      return sum;
    }
    return number + sumWithRecursion(number - 1, sum);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Arguments required ");
      return;
    }
    int number = Integer.parseInt(args[0]);

    System.out.println(sum(number));
    System.out.println(sumWithRecursion(number, 0));
  }
}
