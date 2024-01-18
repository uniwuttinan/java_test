package java_test;

public class App {
    public static void main(String[] args) {
        System.out.println("Pyramid size 3:");
        PyramidMaker pyramidMaker3 = new PyramidMaker(3);
        pyramidMaker3.create();
        pyramidMaker3.display();

        System.out.println("\nPyramid size 5:");
        PyramidMaker pyramidMaker5 = new PyramidMaker(5);
        pyramidMaker5.create();
        pyramidMaker5.display();

        System.out.println("\nPyramid size 10:");
        PyramidMaker pyramidMaker10 = new PyramidMaker(10);
        pyramidMaker10.create();
        pyramidMaker10.display();
    }
}
