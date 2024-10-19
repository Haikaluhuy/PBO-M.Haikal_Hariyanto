public class Direktur extends Pegawai
{
   private double bonus;

   public Direktur(String eNama, String eAlamat, String eNotelp, String esocSecNumber, double rate)
   {
      super(eNama, eAlamat, eNotelp, esocSecNumber, rate);
      bonus = 0;
   }

   public void awardBonus(double execBonus)
   {
      bonus = execBonus;
   }

   public double gajian()
   {
      double payment = super.gajian() + bonus;
      bonus = 0;
      return payment;
   }
}
