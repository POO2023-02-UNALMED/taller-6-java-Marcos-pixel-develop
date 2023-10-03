package vehiculos;
import java.util.HashMap;
import java.util.Map;


public class Fabricante extends Vehiculo{
	public static Pais[] myarray = new Pais[100];

	public String nombre;
   public Pais pais;
   public static int cantidadFabricantes;
   Fabricante() {
	   
   }
   public Fabricante(String nombre, Pais pais){
	   	this.nombre = nombre;
   		this.pais=pais;
   		myarray[cantidadFabricantes++] = pais;  		
}

   protected static Pais encontrarPaisMasComun(Pais[] paises) {
       Map<String, Integer> frecuencia = new HashMap<>();

       for (Pais pais : paises) {
    	   if(pais!=null) {
    		   String nombrePais = pais.getNombre();
               frecuencia.put(nombrePais, frecuencia.getOrDefault(nombrePais, 0) + 1);
    		   
    	   }
           
       }

       String paisMasComun = null;
       int frecuenciaMaxima = 0;

       for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
           String nombrePais = entrada.getKey();
           int frecuenciaActual = entrada.getValue();

           if (frecuenciaActual > frecuenciaMaxima) {
               paisMasComun = nombrePais;
               frecuenciaMaxima = frecuenciaActual;
           }
       }

       return new Pais(paisMasComun);
   }
   public static Pais paisMasVendedor() {
	   Pais value = encontrarPaisMasComun(myarray) ;
	   return value;
	   
	  
   }
   public String getNombre() {
	   return nombre;
   }
   public void setNombre(String nombre) {
	   this.nombre = nombre;
   }
   public Pais getPais() {
	   return this.pais;
   }
   public void setPais(Pais pais) {
	   this.pais=pais;
   }
   public String  toString() {
	   return nombre;
   }
   
}