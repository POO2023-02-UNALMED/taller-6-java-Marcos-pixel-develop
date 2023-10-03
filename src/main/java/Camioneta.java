/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vehiculos;

/**
 *
 * @author usuario
 */
public class Camioneta  extends Vehiculo{
    private boolean volco;
    public Camioneta(){
    	
    }
    public Camioneta(String placa, int puertas,String nombre, int precio,int peso, Fabricante fabricante ,boolean volco){
super(new Camioneta());
        this.velocidadMaxima=90;
        this.traccion="4X4";
        this.puertas = puertas;
        this.volco=volco;
        this.peso= peso;
        this.nombre=nombre;
        this.precio=precio;
        this.fabricante=fabricante;
        this.placa=placa;
        Vehiculo.myarray[Vehiculo.CantidadVehiculos++]=fabricante;

        
        
}
    public boolean isVolco() {
    	return volco;
    }
    public void setVolco(boolean volco) {
    	this.volco = volco;
    }
}