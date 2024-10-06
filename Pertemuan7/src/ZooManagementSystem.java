import com.Lion;
import com.Eagle;
import com.Pigeon;
import com.Buffalo;

public class ZooManagementSystem {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5, "Cokelat keemasan");
        Eagle eagle = new Eagle("Aquila", 3, 200.5);
        Pigeon pigeon = new Pigeon("Columba", 2, "Rock Dove");
        Buffalo buffalo = new Buffalo("Moo", 7, 50.0);

        System.out.println("Informasi Singa:");
        lion.displayLionInfo();
        lion.eat();
        lion.move();

        System.out.println("\nInformasi Elang:");
        eagle.displayEagleInfo();
        eagle.eat();
        eagle.move();

        System.out.println("\nInformasi Merpati:");
        pigeon.displayPigeonInfo();
        pigeon.eat();
        pigeon.move();

        System.out.println("\nInformasi Kerbau:");
        buffalo.displayBuffaloInfo();
        buffalo.eat();
        buffalo.move();
    }
}
