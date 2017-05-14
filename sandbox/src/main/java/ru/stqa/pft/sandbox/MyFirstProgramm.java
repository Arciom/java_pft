package ru.stqa.pft.sandbox;

public class MyFirstProgramm {
  public static void main(String[] args) {
  double l = 5;
  double a = 3.5;
  double b = 5.9;
    System.out.println("Квадрат = " + area(l));
    System.out.println("Прямоугольник: " + area(4.9, 1.3));
  }

  public static double area(double side) {
    return side * side;
  }
  public static double area(double a, double b) {
    return a * b;
  }
}
