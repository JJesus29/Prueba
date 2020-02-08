
package mvc;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class MVC {
 
    public static void main(String[] args) {
      Modelo mod = new Modelo();
      Vista view = new Vista();
      
      Controlador ctrl = new Controlador(view, mod);
      ctrl.iniciar();
      view.setVisible(true);
    }
    
}
