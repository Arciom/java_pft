package ru.stqa.pft.sandbox;

public class MyFirstProgramm {
  public static void main(String[] args) {
    Square s = new Square(5);
    Rectangle r = new Rectangle(3.5, 8.3);
    System.out.println("Квадрат = " + s.area());
    System.out.println("Прямоугольник: " + r.area());
  }
}



















