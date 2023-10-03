package vehiculos;

/**
 *
 * @author usuario
 */

public class Pais extends Fabricante {
    String nombre;
    
    public Pais(String nombre){
    	super();
    	this.nombre = nombre;
    	
    }
    
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public String toString() {
    	return nombre;
    }
}