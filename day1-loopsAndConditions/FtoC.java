public class FtoC {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient arguments ");
      return;
    }

    int fahrenheit = Integer.parseInt(args[0]);
    double celsius = ((fahrenheit - 32) * 5) / 9.0;

    System.out.println(fahrenheit + " to " + celsius);
  }
}
