package bangunruang;

public class Balok extends BangunRuang {
  private float p;
  private float l;
  private float t;

  public Balok(float _p, float _l, float _t) {
    this.p = _p;
    this.l = _l;
    this.t = _t;
  }

  public void hitungLuas() {
    this.luas = 2 * ((p * l) + (l * t) + (p * t));
  }

  public void hitungKeliling() {
    this.keliling = 4 * (p + l + t);
  }

  public void hitungVolume() {
    this.volume = p * l * t;
  }
}
