package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        // Rectangle rectangle = new Rectangle(2, 3);

        // Slide 2 P42
        Shape rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
