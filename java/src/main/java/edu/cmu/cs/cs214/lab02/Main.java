package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        // Интерфэйс төрлийг ашигласнаар тодорхой дүрсээс хамаарахгүй.
        Shape shape = new Rectangle(2, 3);

        // Renderer тодорхой дүрс хадгалахгүй; дурын Shape-ийг дүрслэнэ.
        Renderer renderer = new Renderer();

        // Тодорхой өгөгдөл бус, интерфэйсийн зан төлөвөөр (getArea) дүрслэнэ.
        renderer.draw(shape);
    }
}
