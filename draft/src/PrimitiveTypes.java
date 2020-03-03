public class PrimitiveTypes {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println(maxInt); //  2147483647
        maxInt++;
        System.out.println(maxInt); // -2147483648 (Overflow)

        System.out.println(minInt); // -2147483648
        minInt--;
        System.out.println(minInt); //  2147483647 (Underflow)
    }
}