package java_test;

class Main {
    public static void main(String[] args) {
        System.out.println("Pyramid size 3:");
        PyramidMaker pyramidMaker3 = new PyramidMaker(3);
        pyramidMaker3.create();
        pyramidMaker3.print();

        System.out.println("\nPyramid size 5:");
        PyramidMaker pyramidMaker5 = new PyramidMaker(5);
        pyramidMaker5.create();
        pyramidMaker5.print();

        System.out.println("\nPyramid size 10:");
        PyramidMaker pyramidMaker10 = new PyramidMaker(10);
        pyramidMaker10.create();
        pyramidMaker10.print();

        System.out.println("\nPyramid size 30:");
        PyramidMaker pyramidMaker30 = new PyramidMaker(30);
        pyramidMaker30.create();
        pyramidMaker30.print();
    }
}
