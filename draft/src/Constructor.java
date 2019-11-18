class Point2D {
    public int x;
    public int y;

    public Point2D() {
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point2D {
    public int z;

    // This constructor can be omitted since Java will
    // automatically call the parent's default constructor
    public Point3D() {
        super();
    }
}

public class Constructor {
    public static void main(String[] args) {

    }
}