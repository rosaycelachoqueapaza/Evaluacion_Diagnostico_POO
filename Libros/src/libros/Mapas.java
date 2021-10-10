
package libros;

public class Mapas extends Padre{
   private String ubicacion;
   private int latitud;
   private int longitud;

    public Mapas(int codigo, String titulo, String autor, String ubicacion, int latitud, int longitud) {
        super(codigo, titulo, autor);
        this.ubicacion = ubicacion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

   
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
   @Override
    public String mostrarDatos(){
        System.out.println("\nMAPAS");
        return "Codigo: "+codigo+"\nTitulo: "+titulo+"\nAutor: "+autor+"\nUbicacion: "+ubicacion+
                "\nLatitud: "+latitud+"\nLongitud; "+longitud;  
     }
}
