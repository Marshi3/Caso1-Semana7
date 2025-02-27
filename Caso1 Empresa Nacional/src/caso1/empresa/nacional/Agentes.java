/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1.empresa.nacional;


/**
 *
 * @author Laboratorio
 */
public class Agentes {
    //Atributos
    private double comisiones;
    private double puntos;

    public Agentes(double comisiones, double puntos) {
        this.comisiones = comisiones;
        this.puntos = puntos;
    }
    
    public Agentes(){
        comisiones = 0.0;
        puntos = 0.0;
      
    }
    
    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    
    
    
}
