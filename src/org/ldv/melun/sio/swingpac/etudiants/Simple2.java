package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;

import org.ldv.melun.sio.swingpac.Bidule;

public class Simple2 extends Bidule {

  
  public Simple2() {
    super("Gregy");
    setBackground(Color.BLACK);    
  }

  
  @Override
  public void doMove() {
    setIncY(0); // annule le déplacement horizontal 
  
    super.doMove();  
    					   
  }

  @Override
  protected void doAfterImpactByOther() {
    // faire quelquechose éventuellement ici
    goOnTop(); // par exemple 
  }

  
}
