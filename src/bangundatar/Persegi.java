package bangundatar;

public class Persegi extends BangunDatar {
  private float s;

  public Persegi(float _s) {
    this.s = _s;
  }

  public void hitungLuas() {
    this.luas = s * s;
  }

  public void hitungKeliling() {
    this.keliling = 4 * s;
  }
}
