public class Karnivora extends Mamalia {
    String jenisGigiTaring;

    public Karnivora() {
        super();
        this.jenisGigiTaring = "";
    }

    public Karnivora(String nama, String jenis, int berat, String jenisGigiTaring) {
        super(nama, jenis, berat);
        this.jenisGigiTaring = jenisGigiTaring;
    }

    public String mengkoyakDaging() {
        return "Karnivora mengkoyak daging dengan gigi taring " + jenisGigiTaring;
    }

    public String getInfo(){
        String info = "";
        info += "Nama Hewan         : " + this.nama + "\n";
        info += "Jenis Hewan        : " + this.jenis + "\n";
        info += "Berat Hewan        : " + this.berat + "\n";
        info += "Jenis Gigi Taring  : " + this.jenisGigiTaring+ "\n";

        return info;
    }
}

// gigi taring lurus dan tajam 
// gigi taring melengkung
// gigi taring pipih