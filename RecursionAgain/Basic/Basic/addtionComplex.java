package RecursionAgain.Basic.Basic;

class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        ;
        this.imaginary = imaginary;
    }


    public Complex add(Complex c2) {
        return new Complex(this.real + c2.real, this.imaginary + c2.imaginary);
    }

    public void display(Complex c1) {
        System.out.println(c1.real + "+" + c1.imaginary + "i");
    }
}

public class addtionComplex {
    static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 6);

        Complex c3 = c1.add(c2);
        c3.display(c3);
    }

}
