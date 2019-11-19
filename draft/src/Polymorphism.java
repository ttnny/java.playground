class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: BOW WOW");
    }

    public void nickname() {
        System.out.println("It's puppy");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myDog = new Dog();       // Create a Dog object

        myAnimal.animalSound();
        myDog.animalSound();

        Dog myNewDog = new Dog();       // Create a Dog object
        myNewDog.nickname();            // ???


        /////////////////////////////////////////////////////////
        // Polymorphism recommends to use the highest possible //
        /////////////////////////////////////////////////////////

        // ArrayList & LinkedList classes implements List interface
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Stack class also implements List interface but
        // List<Integer> stack = new Stack<>() doesn't have
        // push(), pop(), and peek() methods
        List<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
    }
}