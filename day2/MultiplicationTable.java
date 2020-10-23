public class MultiplicationTable {

  public static void printTable(int m, int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(m + " * " + i + " = " + m * i);
    }
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments ");
      return;
    }
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    printTable(m, n);
  }
}
