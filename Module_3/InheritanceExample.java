package Cognizant.Module_3;

class Animal{
    public void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.makeSound();
        Dog obj1 = new Dog();
        obj1.makeSound();
    }
}
