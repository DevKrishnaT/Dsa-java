package test;

class A {
    public boolean palindrome(String string) {
        StringBuilder s = new StringBuilder(string);
        return string.contentEquals(s.reverse());
    }

    static void main(String[] args) {
        A fn = new A();
        boolean ans = fn.palindrome("krishna");
        System.out.println(ans);
    }

}

class B extends A {
   
}

public class C {
    static void main(String[] args) {
        B fn = new B();
        boolean ans = fn.palindrome("racecar");
        System.out.println(ans);
    }
}
