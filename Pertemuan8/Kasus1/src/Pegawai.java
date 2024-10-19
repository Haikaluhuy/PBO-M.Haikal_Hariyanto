public class Pegawai extends DaftarPegawai
{
   protected String socialSecurityNumber;
   protected double payRate;

   public Pegawai(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
   {
      super(eName, eAddress, ePhone);
      socialSecurityNumber = socSecNumber;
      payRate = rate;
   }

   public String toString()
   {
      String result = super.toString();
      result += "\nSocial Security Number: " + socialSecurityNumber;
      return result;
   }

   public double gajian()
   {
      return payRate;
   }
}
