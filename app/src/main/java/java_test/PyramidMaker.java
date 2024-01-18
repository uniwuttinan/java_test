package java_test;

public class PyramidMaker {
    private int size = 0;
    private String pyramid = "";

    public PyramidMaker(int size) {
        this.size = size;
    }

    private void buildLevel(int level) {
        // if col is even just fill solid
        if (level % 2 == 0) {
            pyramid += "*".repeat(level);
            return;
        }

        for (int col = 0; col < level; col++) {
            // if floor is even make the room and wall
            // else make the solid floor
            if (col % 2 == 0) {
                pyramid += "*";
            } else {
                pyramid += " ";
            }
        }

    }

    private void nextLevel() {
        pyramid += "\n";
    }

    public String create() {
        for (int level = 0; level < this.size + 1; level++) {
            buildLevel(level);
            nextLevel();
        }

        return pyramid;
    }

    public void display(){
        System.out.println(pyramid);
    }
}
