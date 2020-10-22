public class TemperatureConversion {

  public static double fahrenheitToCelsius(int fahrenheit) {
    double celsius = ((fahrenheit - 32) * 5) / 9.0;
    return celsius;
  }

  public static double celsiusToFahrenheit(int celsius) {
    double fahrenheit = ((celsius * 9) / 5.0) + 32;
    return fahrenheit;
  }

  public static void main(String[] args) {
    System.out.println(fahrenheitToCelsius(98));
    System.out.println(celsiusToFahrenheit(37));
  }
}
