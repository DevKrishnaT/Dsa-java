package ArraysQ;

public class bankQ {
    static void main(String[] args) {
        long balace = 10650;
        balace += 36350;
        for (int i = 0; i < 2; i++) {
            double rateOfIntrest = (balace * 3 * 1) / 100;
            balace += rateOfIntrest;
        }
        balace -= 20000;
        System.out.println(balace);
    }
}
