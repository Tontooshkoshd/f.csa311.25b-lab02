package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        // Use the interface type to avoid depending on a concrete shape.
        Shape shape = new Rectangle(2, 3);

        // Renderer no longer stores a specific shape; it renders any Shape.
        Renderer renderer = new Renderer();

        // Render via interface behavior (getArea), not concrete fields.
        renderer.draw(shape);
    }
}
