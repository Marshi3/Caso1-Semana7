
package caso1.empresa.nacional;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Productos {
    //Atributos
   private boolean electricos;
   private boolean automotrices;
   private boolean construccion;
   

    public Productos(boolean electricos, boolean automotrices, boolean construccion) {
        this.electricos = electricos;
        this.automotrices = automotrices;
        this.construccion = construccion;
    }

    public Productos(){
        
       electricos = JOptionPane.showInputDialog("El producto es electrico? (Si / No )").equals("Si");
       automotrices = JOptionPane.showInputDialog("El producto es automotriz? (Si / No) ").equals("Si");
       construccion = JOptionPane.showInputDialog("El producto es para construccion? (Si / No) ").equals("Si") ;
       
        }
        
    
    public boolean isElectricos() {
        return electricos;
    }

    public void setElectricos(boolean electricos) {
        this.electricos = electricos;
    }

    public boolean isAutomotrices() {
        return automotrices;
    }

    public void setAutomotrices(boolean automotrices) {
        this.automotrices = automotrices;
    }

    public boolean isConstruccion() {
        return construccion;
    }

    public void setConstruccion(boolean construccion) {
        this.construccion = construccion;
    }

    
    
    
}
