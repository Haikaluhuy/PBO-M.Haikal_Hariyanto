public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;  // Urutkan berdasarkan total sales
        } else {
            return other.lastName.compareTo(this.lastName);  // Urutkan nama belakang secara terbalik
        }
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}