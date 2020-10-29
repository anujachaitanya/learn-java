public class Calculator {
  double operand1;
  double operand2;

  public Calculator(double operand1, double operand2) {
    this.operand1 = operand1;
    this.operand2 = operand2;
  }

  public boolean isOperator(String str) {
    return str.matches("^[-+x/]$");
  }

  public double calculate(String operator) {
    double result = 0;
    switch (operator) {
      case "+":
        result = this.operand1 + this.operand2;
        break;
      case "-":
        result = this.operand1 - this.operand2;
        break;
      case "x":
        result = this.operand1 * this.operand2;
        break;
      case "/":
        result = this.operand1 * this.operand2;
        break;
    }
    return result;
  }

  public static void main(String[] args) {
    double operand1 = Double.parseDouble(args[0]);
    double operand2 = Double.parseDouble(args[1]);
    String operator = args[2];

    Calculator myCalculator = new Calculator(operand1, operand2);
    if (!myCalculator.isOperator(operator)) {
      System.out.println("Invalid expression");
      return;
    }

    double result = myCalculator.calculate(operator);
    System.out.println(result);
  }
}
