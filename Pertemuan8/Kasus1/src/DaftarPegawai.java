abstract public class DaftarPegawai
{
   protected String nama;
   protected String alamat;
   protected String notelp;

   public DaftarPegawai(String eNama, String eAlamat, String eNotelp)
   {
      nama = eNama;
      alamat = eAlamat;
      notelp = eNotelp;
   }

   public String toString()
   {
      String result = "Name: " + nama + "\n";
      result += "Address: " + alamat + "\n";
      result += "Phone: " + notelp;
      return result;
   }

   public abstract double gajian();
}
