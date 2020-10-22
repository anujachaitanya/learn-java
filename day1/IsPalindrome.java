public class IsPalindrome {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Insufficient parameters");
      return;
    }
    String string = args[0];
    int i = 0, j = string.length() - 1;
    boolean isPalindrome = true;

    while (i < j) {
      if (string.charAt(i) != string.charAt(j)) {
        isPalindrome = false;
        break;
      }
      i++;
      j--;
    }

    String result = isPalindrome ? "palindrome" : "not palindrome";
    System.out.println(string + " is " + result);
  }
}
