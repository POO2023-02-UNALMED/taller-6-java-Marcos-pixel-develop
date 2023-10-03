/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vehiculos;

/**
 *
 * @author usuario
 */
public class Automovil extends Vehiculo{
    public int puestos;
    public static int cantidadVehiculos;

    public Automovil(){
    	
    }
    public Automovil(String placa, String nombre, int precio,int peso, Fabricante fabricante ,int puestos){
super(new Automovil());
        this.puertas = 4;
        this.velocidadMaxima=100;
        this.traccion = "FWD";
        this.puestos=puestos;
        this.nombre=nombre;
        this.precio=precio;
        this.peso = peso;
        this.fabricante=fabricante;
        this.placa=placa;
        Vehiculo.myarray[Vehiculo.CantidadVehiculos++]=fabricante;

        
}
    public int getPuestos() {
    	return puestos;
    }
    public void setPuestos(int puestos) {
    	this.puestos=puestos;
    }
}