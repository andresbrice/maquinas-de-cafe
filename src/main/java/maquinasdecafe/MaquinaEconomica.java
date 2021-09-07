package maquinasdecafe;

public class MaquinaEconomica extends MaquinaDeCafe {
  private int contadorDeServidos;

  @Override
  protected void restarCafe() {
    this.contadorDeServidos++;
    if (this.contadorDeServidos % 3 == 0) {
      super.restarCafe();
      this.contadorDeServidos = 0;
    }
  }
}
