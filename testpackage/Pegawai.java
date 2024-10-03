// package JB6;
package testpackage;
import testpackage.Pegawai;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    // public Pegawai() {
    //     System.out.println("objek dari class pegawai dibuat");
    // }

    public Pegawai (String nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo(){
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";

        return info;
    }
}