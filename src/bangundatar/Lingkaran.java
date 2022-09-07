package bangundatar;

public class Lingkaran extends BangunDatar {
  private float phi;
  private float r;

  public Lingkaran(float _r) {
    this.phi = 3.14f;
    this.r = _r;
  }

  public void hitungLuas() {
    this.luas = phi * r * r;
  }

  public void hitungKeliling() {
    this.keliling = 2 * phi * r;
  }
}
