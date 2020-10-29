public class OddsInRange {

  public static void main(String[] args) {
    System.out.println(args.length);
    if (args.length < 2) {
      System.out.println("pass two arguments");
      return;
    }
    int rangeStart = Integer.parseInt(args[0]);
    int rangeEnd = Integer.parseInt(args[1]);

    int currentNumber = rangeStart % 2 == 0 ? rangeStart + 1: rangeStart;

    while(currentNumber <= rangeEnd){
      System.out.println(currentNumber);
      currentNumber += 2;
    }
  }
  }
}
