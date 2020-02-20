abstract class AnimalA {
    void temp() {
        System.out.println("Nothing");
    }

    abstract void eat();
    abstract void drink();
}

interface AnimalI {
    void eat();
    void drink();
}

class Dog extends AnimalA implements AnimalI {

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }
}

class Cat extends AnimalA {
    @Override
    void eat() {

    }

    @Override
    void drink() {

    }
}

