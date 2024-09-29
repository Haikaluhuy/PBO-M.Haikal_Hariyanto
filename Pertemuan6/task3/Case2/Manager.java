class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int day, int month, int year) {
        super(n, s, day, month, year);
        secretaryName = "";
    }

    public void raiseSalary(double byPercent) {
        // Tambahkan 1/2% bonus untuk setiap tahun masa kerja
        java.util.GregorianCalendar todaysDate = new java.util.GregorianCalendar();
        int currentYear = todaysDate.get(java.util.Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String name) {
        this.secretaryName = name;
    }
}