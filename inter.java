interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class inter {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();

        Animal a2 = new Cat();
        a2.sound();
    }
}