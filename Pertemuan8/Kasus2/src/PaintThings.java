public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350); // Contoh coverage 350

        // Membuat objek bentuk
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        // Menghitung jumlah cat yang dibutuhkan
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Menampilkan hasil
        System.out.printf("Amount of paint for deck: %.2f\n", deckAmt);
        System.out.printf("Amount of paint for big ball: %.2f\n", ballAmt);
        System.out.printf("Amount of paint for tank: %.2f\n", tankAmt);
    }
}
