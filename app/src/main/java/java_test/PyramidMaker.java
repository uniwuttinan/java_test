package java_test;

public class PyramidMaker {
    private int size = 0;
    private String pyramid = "";

    public PyramidMaker(int size) {
        this.size = size;
    }

    private void buildLevel(int size, int count) {
        for (int i = 0; i < size; i++) {
            String line = "*".repeat(i+1);
            line += " ".repeat(size-i);
            line = line.repeat(count);
            line = line.trim();
            pyramid += line + "\n";
        }
    }

    public String create() {
        for (int level = 0; level < this.size; level++) {
            buildLevel(size, level + 1);
        }
        return pyramid;
    }

    public void print() {
        System.out.println(pyramid);
    }
}
