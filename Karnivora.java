package Hewan;

public class Karnivora extends Mamalia {
    private String nama, habitat, beratRataRata;
    Karnivora(String nama, String beratRataRata, String habitat){
        this.nama = nama;
        this.beratRataRata = beratRataRata;
        this.habitat = habitat;
    }
    void makan(){
        System.out.println("Makan :\n=== Saya memakan daging.\n");
    }
    void getData(){
        System.out.println("\nData Objek Karnivora : ");
        System.out.println("Nama : " + nama + "\nBerat : " + beratRataRata + "\nHabitat : " + habitat);
    }
}
