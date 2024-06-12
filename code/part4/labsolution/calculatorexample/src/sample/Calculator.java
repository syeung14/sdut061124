package sample;

public class Calculator {
  public int add(int op1, int op2) {
  //public double add(double op1, double op2) {
    return op1 + op2;
  }

  public int divide(int numerator, int denominator) {
  //public double divide(double numerator, double denominator) { //uncomment this line, comment the previous line and then run the tests to see the change in behavior.
    return numerator / denominator;
  }
}
//without having any test cases, the compiler will not give us any errors when we change
//from int to double. With tests cases, we have much better feedback loops.
