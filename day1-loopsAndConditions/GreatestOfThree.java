public class GreatestOfThree {

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments ");
      return;
    }
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);

    int greater = number1 > number2 ? number1 : number2;
    int greatest = greater > number3 ? greater : number3;

    System.out.println("greatest is " + greatest);
  }
}
