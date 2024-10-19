public class PekerjaLepas extends Pegawai
{
   private int hoursWorked;

   public PekerjaLepas(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
   {
      super(eName, eAddress, ePhone, socSecNumber, rate);
      hoursWorked = 0;
   }

   public void addHours(int moreHours)
   {
      hoursWorked += moreHours;
   }

   public double gajian()
   {
      double payment = payRate * hoursWorked;
      hoursWorked = 0;
      return payment;
   }

   public String toString()
   {
      String result = super.toString();
      result += "\nCurrent hours: " + hoursWorked;
      return result;
   }
}
