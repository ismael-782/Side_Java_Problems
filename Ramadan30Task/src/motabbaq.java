public class motabbaq {
    public static void main(String[] args) {

        int N = 20;
        int small = 15; // small has 6, and the value is the price of a small.
        int mid = 20; // medium has 8 ,and the value is the price of a medium.
        int big = 25; // larg has 12 ,and the value is the price of a large.

        System.out.println(minMoneyForNmotabaqa(N, small, mid, big));

    }

    public static int minMoneyForNmotabaqa(int N, int small, int mid, int big) {

        if (N <= 0) {
            return 0;
        }
        return minimum(
                small + minMoneyForNmotabaqa(N - 6, small, mid, big),
                mid + minMoneyForNmotabaqa(N - 8, small, mid, big),
                big + minMoneyForNmotabaqa(N - 12, small, mid, big));
    }

    public static int minimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

}
