package Strings;

public class LargetsOdd {
    static void main(String[] args) {
        String num = "52468024";
        String ans = FinfLargest(num);
        System.out.println(ans);
    }

    private static String FinfLargest(String num) {
        int largetsIdx = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                largetsIdx = i;
                break;
            }

        }
        if (largetsIdx == -1) return "";
        return num.substring(0, largetsIdx + 1);
    }
}
