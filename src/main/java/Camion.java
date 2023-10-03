/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vehiculos;

/**
 *
 * @author usuario
 */
public class Camion  extends Vehiculo{
    private int ejes;
    Camion(){
    	
    	
    }
    Camion(String placa, String nombre, int precio, Fabricante fabricante ,int ejes){
    	super(new Camion());
        
        this.puertas = 2;
        this.velocidadMaxima=80;
        this.traccion = "4X2";
        this.ejes=ejes;
        this.nombre=nombre;
        this.precio=precio;
        this.fabricante=fabricante;
        this.placa=placa;
        Vehiculo.myarray[Vehiculo.CantidadVehiculos++]=fabricante;
}
    public int getEjes() {
    	return ejes;
    }
    public void setEjes() {
    	this.ejes = ejes;
    }
}