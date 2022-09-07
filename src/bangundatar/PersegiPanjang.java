package bangundatar;

public class PersegiPanjang extends BangunDatar {
  private float p;
  private float l;

  public PersegiPanjang(float _p, float _l) {
    this.p = _p;
    this.l = _l;
  }

  public void hitungLuas() {
    this.luas = p * l;
  }

  public void hitungKeliling() {
    this.keliling = 2 * (p + l);
  }
}
