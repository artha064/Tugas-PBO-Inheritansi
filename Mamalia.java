package Hewan;

public class Mamalia extends Hewan {
    void gerak(){
        super.gerak();
        System.out.println("=== Saya mempunyai kaki.");
    }
    void reproduksi(){
        super.reproduksi();
        System.out.println("=== Saya dapat bereproduksi dengan melahirkan.");
    }
    void menyusui(){
        System.out.println("=== Saya dapat menyusui.");
    }
}
