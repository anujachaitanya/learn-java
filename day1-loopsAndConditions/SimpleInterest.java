public class SimpleInterest {

  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("Insufficient arguments !");
      return;
    }
    int principle = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    int si = (principle * rate * period) / 100;
    System.out.println(si);
  }
}
