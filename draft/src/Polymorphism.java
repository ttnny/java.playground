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
        myNewDog.nickname();
    }
}