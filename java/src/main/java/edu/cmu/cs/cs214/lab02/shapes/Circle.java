package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    // Encapsulation: hide internal radius; expose only via behavior.
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
