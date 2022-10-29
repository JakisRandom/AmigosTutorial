package pl.jakisrandom;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Frumpkin";
        cat.meow();
    }

    static class Cat {
        String name;

        void meow() {
            System.out.println(name + ":meow...");
        }
    }
}