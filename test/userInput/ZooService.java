package test.userInput;

import Revision.DoublyLinkedList.Implementation;

interface Animal {
    void eat();
}


class Dog implements Animal {
    public void eat() {
        System.out.println("dog eat");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("cat eat");
    }
}

public class ZooService {
    static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();

        Cat c1 = new Cat();
        c1.eat();
    }
}
