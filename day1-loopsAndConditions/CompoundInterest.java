public class CompoundInterest {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments ");
      return;
    }

    int principle = Integer.parseInt(args[0]);
    double rate = Integer.parseInt(args[1]) / 100.0;
    int time = Integer.parseInt(args[2]);

    double finalAmount = principle;
    while (time > 0) {
      finalAmount *= (1 + rate);
      time--;
    }

    double ci = finalAmount - principle;
    System.out.println("Compound interest is " + ci);
  }
}
