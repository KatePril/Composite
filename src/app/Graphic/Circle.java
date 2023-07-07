package app.Graphic;

public class Circle extends Dot {
    protected int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Circle radius: %d; coordinates x: %d, y: %d;%n",radius, x, y);
    }
}
