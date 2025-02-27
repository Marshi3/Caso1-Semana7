
package caso1.empresa.nacional;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Facturas {
    //Atributos
    private String nombreCliente;
    private int cedulaCliente;
    private int codigoFactura;
    private double montoFactura;
    private Productos producto;
    private Agentes puntos; 
    public String leeDatos;
    
   
    
    //Numero de mes indicado(1 enero, 2 febrero...)
    //Indicador si la factura contiene productos electricos
    //Indicador si la factura contiene Productos automotrices
    //Indicador si la factra contiene productos construccion
    // While para la salida del programa para saber cuantas debe registrar.
    
    public Facturas(){
        nombreCliente = JOptionPane.showInputDialog("Digite el nombre de cliente.");
        cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del cliente."));
        codigoFactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de la factura del cliente."));
        montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Digite el monto total de la factura del cliente."));
    }

    public Facturas(String nombreCliente, int cedulaCliente, int codigoFactura, double montoFactura) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
    }

    @Override
    public String toString() {
        return "Facturas{" + "nombreCliente=" + nombreCliente + ", cedulaCliente=" + cedulaCliente + ", codigoFactura=" + codigoFactura + ", montoFactura=" + montoFactura + '}';
    }
    
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        
        this.producto = producto;
    }
    
    /* boolean Facturas = true;
     String salida;
        while (Facturas) {
            salida = JOptionPane.showInputDialog("Seguirá agregando más facturas?");
            if (salida.compareTo("Si") == 0 || salida.compareTo("Si") == 0 || salida.compareTo("Si") == 0) {
                Facturas = false;
            }*/

    public Agentes getPuntos() {
        return puntos;
    }

    public void setPuntos(Agentes puntos) {
        this.puntos = puntos;
    }

    public String getLeeDatos() {
     
        return leeDatos;
    }

    public void setLeeDatos(String leeDatos) {
        this.leeDatos = leeDatos;
    }
}
    
    
   

