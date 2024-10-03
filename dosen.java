// import Pegawai;

import testpackage.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        System.out.println("objek dari class dosen dibuat");
    }

    public String getInfo(){
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo(){
        String info = super.getInfo();
        // info += "NIP    : " + super.nip + "\n";
        // info += "Nama   : " + super.nama + "\n";
        // info += "Gaji   : " + super.gaji + "\n";
        info += "NIDN   : " + nidn + "\n";
        return info;
    }
}