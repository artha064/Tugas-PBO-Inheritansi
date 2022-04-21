package Hewan;

public class Main {
    public static void main(String[] args) {
        Karnivora macanSatu = new Karnivora("Cheetah", "21 - 70kg", "Savannah");
        macanSatu.getData();        
        macanSatu.gerak();
        macanSatu.reproduksi();
        macanSatu.menyusui();
        macanSatu.makan();
    }
}
