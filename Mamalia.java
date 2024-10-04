public class Mamalia {
    String nama;
    String jenis;
    int berat;

    public Mamalia() {
        this.nama = "";
        this.jenis = "";
        this.berat = 0;
    }

    public Mamalia(String nama, String jenis, int berat) {
        this.nama = nama;
        this.jenis = jenis;
        this.berat = berat;
    }

    // public static void main(String[] args) {
    //     Karnivora karnivora = new Karnivora("Singa", "Karnivora", 200, "lurus dan tajam");
    //     System.out.println(karnivora.getInfo());
    //     System.out.println("--------------------------------");
    //     Herbivora herbivora = new Herbivora("Kambing", "Herbivora", 50, "depan");
    //     System.out.println(herbivora.getInfo());
    // }
}