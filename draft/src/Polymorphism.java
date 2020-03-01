class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Puppy extends Animal {
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
        Animal myPuppy = new Puppy();   // Create a Dog object type Animal

        myAnimal.animalSound();
        myPuppy.animalSound();

        Puppy myNewPuppy = new Puppy(); // Create a Dog object type Dog
        myNewPuppy.nickname();          // Because of type Dog, it has nickname()
    }
}