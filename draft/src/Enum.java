enum RGBColor {
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF");

    private String hexCode;

    private RGBColor(String hexCode) {
        this.hexCode = hexCode;
    }

    public static void main(String[] args) {
        RGBColor red = RGBColor.RED;
        System.out.println(red.hexCode);
    }
}
