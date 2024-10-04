public class Herbivora extends Mamalia {
    String jenisGigiGeraham;

    public Herbivora() {
        super();
        this.jenisGigiGeraham = "";
    }

    public Herbivora(String nama, String jenis, int berat, String jenisGigiGeraham) {
        super(nama, jenis, berat);
        this.jenisGigiGeraham = jenisGigiGeraham;
    }

    public String mengunyahRumput() {
        return "Herbivora mengunyah rumput dengan gigi geraham " + jenisGigiGeraham;
    }

    public String getInfo(){
        String info = "";
        info += "Nama Hewan         : " + this.nama + "\n";
        info += "Jenis Hewan        : " + this.jenis + "\n";
        info += "Berat Hewan        : " + this.berat + "\n";
        info += "Jenis Gigi Geraham : " + this.jenisGigiGeraham+ "\n";

        return info;
    }
}

// gigi geraham depan
// gigi geraham belakang