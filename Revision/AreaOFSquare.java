package Revision;

public class AreaOFSquare {
    static void main(String[] args) {
        int r = 5;
        double ans = area(r);
        double perimeter = Perimeter(r);
        System.out.println(ans);
        System.out.println("perimeter" + perimeter);
    }

    private static double Perimeter(int r) {
        double pie = 3.14;
        return 2 * pie * r;
    }

    private static double area(int r) {
        double pie = 3.14;

        return pie * (r * r);
    }
}
