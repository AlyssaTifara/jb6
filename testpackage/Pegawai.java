// package JB6;
package testpackage;
import testpackage.Pegawai;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("objek dari class pegawai dibuat");
    }

    public String getInfo(){
        String info = " ";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";

        return info;
    }
}