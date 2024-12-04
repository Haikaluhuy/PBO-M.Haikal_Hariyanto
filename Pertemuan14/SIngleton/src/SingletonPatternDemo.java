
class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionString;
    
    private DatabaseConnection() {
        this.connectionString = "jdbc:mysql://localhost:3306/db";
        System.out.println("Membuat koneksi database baru ke " + connectionString);
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void connect() {
        System.out.println("Terhubung ke database menggunakan " + connectionString);
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        System.out.println("Mencoba mendapatkan koneksi database pertama:");
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();
        
        System.out.println("\nMencoba mendapatkan koneksi database kedua:");
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.connect();
        
        System.out.println("\nApakah kedua koneksi sama? " + (connection1 == connection2));
    }
}