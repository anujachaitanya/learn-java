public class ReverseString {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient parameters");
      return;
    }
    String reverseString = "";
    String string = args[0];

    for (int charPos = string.length() - 1; charPos >= 0; charPos--) {
      reverseString = reverseString + string.charAt(charPos);
    }
    System.out.println(reverseString);
  }
}
