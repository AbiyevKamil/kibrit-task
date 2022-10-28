public class PerfectSquareCounter {

    public static int count(int sumOfSquares) {
        if (sumOfSquares <= 3) return sumOfSquares;
        int[] sq = new int[sumOfSquares + 1];
        sq[0] = 0;
        sq[1] = 1;
        sq[2] = 2;
        sq[3] = 3;
        for (int j = 4; j <= sumOfSquares; j++) {
            sq[j] = j;
            for (int i = 1; i <= Math.ceil(Math.sqrt(j)); i++) {
                int temp = i * i;
                if (temp > j) break;
                sq[j] = Math.min(sq[j], 1 + sq[j - temp]);
            }
        }
        return sq[sumOfSquares];
    }
}
