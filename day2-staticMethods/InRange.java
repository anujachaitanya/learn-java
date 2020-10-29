public class InRange {

  public static void evensInRange(int rangeStart, int rangeEnd) {
    int currentNumber = rangeStart % 2 == 0 ? rangeStart : rangeStart + 1;

    while (currentNumber <= rangeEnd) {
      System.out.println(currentNumber);
      currentNumber += 2;
    }
  }

  public static void oddsInRange(int rangeStart, int rangeEnd) {
    int currentNumber = rangeStart % 2 == 0 ? rangeStart + 1 : rangeStart;

    while (currentNumber <= rangeEnd) {
      System.out.println(currentNumber);
      currentNumber += 2;
    }
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("pass two arguments");
      return;
    }

    int rangeStart = Integer.parseInt(args[0]);
    int rangeEnd = Integer.parseInt(args[1]);
    evensInRange(rangeStart, rangeEnd);
    oddsInRange(rangeStart, rangeEnd);
  }
}
