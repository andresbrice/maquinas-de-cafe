package maquinasdecafe;

public abstract class MaquinaDeCafe {
  private static final int GRAMOS_POR_CAFE = 10;
  private static final int CANTIDAD_INICIAL_DE_CAFE = 1000;
  private int gramosDeCafe;

  public MaquinaDeCafe() {
    this.gramosDeCafe = CANTIDAD_INICIAL_DE_CAFE;
  }

  public VasoDeCafe servirCafe() {
    if (!this.puedeServir()) {
      return new VasoDeCafe(false);
    }
    this.restarCafe();
    return new VasoDeCafe(true);
  }

  protected boolean puedeServir() {
    return this.gramosDeCafe >= GRAMOS_POR_CAFE;
  }

  protected void restarCafe() {
    this.gramosDeCafe -= GRAMOS_POR_CAFE;
  }

  public int getGramosDeCafe() {
    return this.gramosDeCafe;
  }
}
