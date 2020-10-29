public class Numbers {

  public static int[] repeat(int number, int n) {
    int[] repeated = new int[n];
    for (int index = 0; index < n; index++) {
      repeated[index] = number;
    }
    return repeated;
  }

  public static int findLargest(int[] array) {
    int largest = array[0];
    for (int index = 0; index < array.length; index++) {
      if (largest < array[index]) {
        largest = array[index];
      }
    }
    return largest;
  }

  public static void printArray(int[] array) {
    for (int number : array) {
      System.out.println(number);
    }
  }

  public static double average(int[] numbers) {
    int sum = 0;

    for (int index = 0; index < numbers.length; index++) {
      sum += numbers[index];
    }
    return (sum / (double) numbers.length);
  }

  public static boolean isAscending(int[] numbers) {
    for (int index = 0; index < numbers.length - 1; index++) {
      if (numbers[index] >= numbers[index + 1]) {
        return false;
      }
    }
    return true;
  }

  public static int[] concat(int[] array1, int[] array2) {
    int[] newArray = new int[array1.length + array2.length];

    for (int index = 0; index < newArray.length; index++) {
      if (index < array1.length) {
        newArray[index] = array1[index];
      } else {
        newArray[index] = array2[index - array1.length];
      }
    }

    return newArray;
  }

  public static int[] range(int start, int end, int step) {
    int totalNumbers = (end - start) / step + 1;
    int[] rangeOfNumbers = new int[totalNumbers];
    int currentNumber = start;

    for (int index = 0; index < totalNumbers; index++) {
      rangeOfNumbers[index] = currentNumber;
      currentNumber += step;
    }
    return rangeOfNumbers;
  }

  public static int[] range(int start, int end) {
    return range(start, end, 1);
  }

  public static void main(String[] args) {
    printArray(range(1, 5));
    printArray(range(1, 10, 2));
    printArray(range(5, 1, -1));

    printArray(repeat(5, 4));
    printArray(repeat(3, 6));

    System.out.println(findLargest(range(1, 5)));
    System.out.println(findLargest(range(10, 5, -1)));

    System.out.println(average(range(1, 5)));
    System.out.println(average(range(1, 10, 2)));

    int[] numbers = { 1, 1, 3 };
    System.out.println(isAscending(numbers));
    System.out.println(isAscending(range(1, 5)));

    printArray(concat(range(1, 5), repeat(5, 2)));
  }
}
