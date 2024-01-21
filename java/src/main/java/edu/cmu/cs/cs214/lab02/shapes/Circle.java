package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    // Slide 2 P54
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
