public class GreatestOfThree {

  public static int getGreatest(int number1, int number2, int number3) {
    return Math.max(Math.max(number1, number2), number3);
  }

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments ");
      return;
    }
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);

    int greatest = getGreatest(number1, number2, number3);

    System.out.println("greatest is " + greatest);
  }
}
