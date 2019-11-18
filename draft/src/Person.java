public class Person {
    private String name;
    private int age;
    private static int numOfPeople = 0;

    private Person() {
        numOfPeople++;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
        numOfPeople++;
    }

    public static void main(String[] args) {
        Person A = new Person();
        System.out.println(A);

        Person B = new Person("Chicken Teriyaki", 20);
        System.out.println(B);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", numOfPeople=" + numOfPeople + '\'' +
                '}';
    }
}