package test;

public class Regexmaker {
    static void main(String[] args) {
        String s = "my phone number is 9580020611";

        s = s.replaceAll("[^0-9]", "");
        System.out.println(s);
    }
}
