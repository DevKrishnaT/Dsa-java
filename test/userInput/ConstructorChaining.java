package test.userInput;

class Box {
    double l;
    double b;
    double h;
    double w;

    Box() {
        this(10, 20, 30);
    }

    Box(double l, double b, double h) {
        this(l, b, h, 40);

    }

    Box(double l, double b, double h, double w) {
        this.l = l;
        this.b = b;
        this.h = h;
        this.w = w;
    }

    void print() {
        System.out.println("l:- " + l + " b :- " + b + " h;-" + h + " w:-" + w);
    }


}

public class ConstructorChaining {
    static void main(String[] args) {
        Box b1 = new Box();
        b1.print();
    }

}
