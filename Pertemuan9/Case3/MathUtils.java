public class MathUtils {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak didefinisikan untuk angka negatif: " + n);
        } else if (n > 16) {
            throw new IllegalArgumentException("Faktorial terlalu besar untuk dihitung bagi angka: " + n);
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
