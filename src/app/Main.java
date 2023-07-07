package app;

import app.Graphic.Circle;
import app.Graphic.Dot;
import app.Graphic.Graphic;

public class Main {
    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load();
        imageEditor.groupSelected(new Graphic[]{new Dot(8, 9), new Circle(4, 7, 10)});
    }
}
