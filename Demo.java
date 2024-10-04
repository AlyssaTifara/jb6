public class Demo {
    public static void main(String[] args) {
        Karnivora karnivora = new Karnivora("Singa", "Karnivora", 200, "lurus dan tajam");
        System.out.println(karnivora.getInfo());
        System.out.println("--------------------------------");
        Herbivora herbivora = new Herbivora("Kambing", "Herbivora", 50, "depan");
        System.out.println(herbivora.getInfo());
    }
}