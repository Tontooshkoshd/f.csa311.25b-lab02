package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    // Битүүмжлэл: дотоод радиусыг нууж, зөвхөн зан төлөвөөр ил гаргана.
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
