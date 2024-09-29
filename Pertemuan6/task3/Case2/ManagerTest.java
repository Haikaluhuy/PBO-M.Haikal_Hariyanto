public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("Sebelum kenaikan gaji:");
        for (Employee e : staff) {
            e.print();
        }

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        System.out.println("\nSetelah kenaikan gaji:");
        for (Employee e : staff) {
            e.print();
        }
    }
}