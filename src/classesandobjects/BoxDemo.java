package classesandobjects;

public class BoxDemo {

    public static void main(String[] args) {

        Box b = new Box(10, 20, 40);

        System.out.println("Width  : " + b.width);
        System.out.println("Height : " + b.height);
        System.out.println("Depth  : " + b.depth);
        System.out.println("Volume : " + b.volume());
    }
}