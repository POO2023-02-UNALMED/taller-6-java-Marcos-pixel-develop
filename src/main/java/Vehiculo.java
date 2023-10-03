package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Vehiculo {
    static Fabricante[] myarray = new Fabricante[100];
    protected String placa;
    protected int puertas;
    protected float velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int CantidadVehiculos;
    static int  CantidadVehiculosAutomovil;
    static int  CantidadVehiculosCamioneta;
    static int  CantidadVehiculosCamion;
    
    Vehiculo(){
    	
    	
}
    Vehiculo(Automovil auto){
    	this();
    	CantidadVehiculosAutomovil++;
    	
    }
    Vehiculo(Camioneta camioneta){
    	this();
    	CantidadVehiculosCamioneta++;
    }
    Vehiculo(Camion camion){
    	this();
    	CantidadVehiculosCamion++;
    }
    private static Fabricante encontrarFabricanteMasComun(Fabricante[] fabricantes) {
        Map<String, Integer> frecuencia = new HashMap<>();

        for (Fabricante fabricante : fabricantes) {
     	   if(fabricante!=null) {
     		   String nombreFabricante = fabricante.getNombre();
                frecuencia.put(nombreFabricante, frecuencia.getOrDefault(nombreFabricante, 0) + 1);
     		   
     	   }
            
        }

        String fabricanteMasComun = null;
        int frecuenciaMaxima = 0;

        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
            String nombreFabricante = entrada.getKey();
            int frecuenciaActual = entrada.getValue();

            if (frecuenciaActual > frecuenciaMaxima) {
                fabricanteMasComun = nombreFabricante;
                frecuenciaMaxima = frecuenciaActual;
            }
        }

        return new Fabricante(fabricanteMasComun, new Pais(""));
    }
    static public Fabricante fabricaMayorVentas() {
    	Fabricante value = encontrarFabricanteMasComun(myarray);
    	return value;
    }
    public int getPuertas(){
        return puertas;
    }
    public static String vehiculosPorTipo() {
    	return "Automoviles:" + CantidadVehiculosAutomovil +"\n"+
    			"Camionetas:" + CantidadVehiculosCamioneta+"\n"+
    			"Camiones:"+ CantidadVehiculosCamion;  
    }
    public int getPrecio(){
        return precio;
    }
    public static int getCantidadVehiculos(){
        return CantidadVehiculos;
    }
    public String getPlaca() {
    	return placa;
    			
    }
    public String getTraccion() {
    	return traccion;
    			
    }
    public String getNombre() {
    	return nombre;
    			
    }
    public float getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setPuertas(int puertas) {
    	this.puertas = puertas;
    }
    public void setPrecio(int precio) {
    	this.precio=precio;
    }
    public void setPlaca(String placa) {
    	this.placa = placa;
    }
    public void setTraccion(String traccion) {
    	this.traccion = traccion;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
}