class FunctionalInterface {
    interface Multiply {
        int calculate(int a, int b);

        // Interface default method
        // No implementation needed from concrete class
        default void status() {
            System.out.println("Multiplication Executed");
        }
    }

    public static void main(String[] args) {
        // Using lambda expression to define 'calculate' method
        Multiply multiplication = (int num1, int num2) -> num1 * num2;

        // Passed-in parameters and return type must be
        // the same as defined in the functional interface
        int test = multiplication.calculate(12, 8);
        System.out.println(test);

        // Result is 96
    }
}