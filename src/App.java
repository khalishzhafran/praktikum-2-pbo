import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;

import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Kubus;

public class App {
  public static void main(String[] args) {
    Lingkaran lingkaran = new Lingkaran(7);
    System.out.println(">>> " + lingkaran.getClass().getSimpleName());
    lingkaran.hitungLuas();
    lingkaran.hitungKeliling();
    lingkaran.printInfo();

    System.out.println("===================================================");

    Persegi persegi = new Persegi(3);
    System.out.println(">>> " + persegi.getClass().getSimpleName());
    persegi.hitungLuas();
    persegi.hitungKeliling();
    persegi.printInfo();

    System.out.println("===================================================");

    PersegiPanjang persegiPanjang = new PersegiPanjang(3, 4);
    System.out.println(">>> " + persegiPanjang.getClass().getSimpleName());
    persegiPanjang.hitungLuas();
    persegiPanjang.hitungKeliling();
    persegiPanjang.printInfo();

    System.out.println("===================================================");

    Balok balok = new Balok(3, 4, 5);
    System.out.println(">>> " + balok.getClass().getSimpleName());
    balok.hitungLuas();
    balok.hitungKeliling();
    balok.hitungVolume();
    balok.printInfo();

    System.out.println("===================================================");

    Bola bola = new Bola(14);
    System.out.println(">>> " + bola.getClass().getSimpleName());
    bola.hitungLuas();
    bola.hitungKeliling();
    bola.hitungVolume();
    bola.printInfo();

    System.out.println("===================================================");

    Kubus kubus = new Kubus(5);
    System.out.println(">>> " + kubus.getClass().getSimpleName());
    kubus.hitungLuas();
    kubus.hitungKeliling();
    kubus.hitungVolume();
    kubus.printInfo();
  }
}
