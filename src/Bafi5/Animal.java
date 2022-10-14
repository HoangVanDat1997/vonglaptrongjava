package Bafi5;

public class Animal {
    protected String name = "Dog";

    public void bark() {
        System.out.println("Gâu Gâu");
    }

    static class Dog extends Animal {
        private String species = "Dof";
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        System.out.println(dog.name + " " + dog.species);

    }

}
