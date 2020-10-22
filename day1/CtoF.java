public class CtoF {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments ");
      return;
    }
    int celsius = Integer.parseInt(args[0]);
    double fahrenheit = ((celsius * 9) / 5.0) + 32;

    System.out.println(celsius + " to " + fahrenheit);
  }
}
