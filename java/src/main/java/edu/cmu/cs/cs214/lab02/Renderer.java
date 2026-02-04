package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    // Битүүмжлэл: тодорхой класс/өгөгдлөөс биш, Shape-ын зан төлөвөөс хамаарна.
    public void draw(Shape shape) {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
