package maquinasdecafe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaquinaDePremiumTest {

  MaquinaDeCafe maquina;

  @Before
  public void setup(){
    maquina = new MaquinaPremium();
  }

  @Test
  public void queDevuelveUnVasoAlServir() {
    VasoDeCafe vaso = maquina.servirCafe();
    Assert.assertNotNull(vaso);
  }

  @Test
  public void quePuedaServirUnCafe() {
    maquina.servirCafe();
    Assert.assertTrue(maquina.puedeServir());
  }

  @Test
  public void queSeAgotaElCafe() {
    for (int i = 0; i < 100; i++) {
      maquina.servirCafe();
    }
    Assert.assertFalse(maquina.puedeServir());
  }

  @Test
  public void queLuegodeagotarelCafeSirveVasoVacio() {
    for (int i = 0; i < 100; i++) {
      maquina.servirCafe();
    }
    VasoDeCafe vaso = maquina.servirCafe();
    Assert.assertFalse(vaso.estaLleno());
  }
}