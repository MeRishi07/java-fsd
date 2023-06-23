package Assisted_Practice_Projects2;

interface Animal {
    default void sound() {
        System.out.println("Animal is making a sound.");
    }
}

interface Mammal extends Animal {
    default void sound() {
        System.out.println("Mammal is making a sound.");
    }
}

interface Bird extends Animal {
    default void sound() {
        System.out.println("Bird is making a sound.");
    }
}

class Platypus implements Mammal, Bird {
    @Override
    public void sound() {
        Mammal.super.sound();
        Bird.super.sound();
    }
}

public class Practice_Project09 {
    public static void main(String[] args) {
        Platypus platypus = new Platypus();
        platypus.sound();
    }
}
