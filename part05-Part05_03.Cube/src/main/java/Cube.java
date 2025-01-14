public class Cube {

    private int length;

    public Cube(int edgeLength) {
        this.length = edgeLength;
    }

    public int volume() {
        return (int) Math.pow(length, 3);
    }

    public String toString() {
        return "The length of the edge is " + length + " and the volume " + volume();
    }
}
