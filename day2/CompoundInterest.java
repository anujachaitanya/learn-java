public class CompoundInterest {

  public static double getCi(int principle, double rate, int time) {
    rate = rate / 100.0;
    return principle * Math.pow((1 + rate), time) - principle;
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments ");
      return;
    }

    int principle = Integer.parseInt(args[0]);
    double rate = Double.parseDouble(args[1]);
    int time = Integer.parseInt(args[2]);

    double ci = getCi(principle, rate, time);
    System.out.println("Compound interest is " + ci);
  }
}
