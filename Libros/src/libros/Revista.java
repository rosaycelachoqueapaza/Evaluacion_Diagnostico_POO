
package libros;

public class Revista extends Padre{
   private int NroArticulos; 

    public Revista(int codigo, String titulo, String autor, int NroArticulos) {
        super(codigo, titulo, autor);
        this.NroArticulos = NroArticulos;
    }

    public int getNroArticulos() {
        return NroArticulos;
    }

    public void setNroArticulos(int NroArticulos) {
        this.NroArticulos = NroArticulos;
    }
    
   @Override
    public String mostrarDatos(){
        System.out.println("\nREVISTAS");
        return "Codigo: "+codigo+"\nTitulo: "+titulo+"\nAutor: "+autor+"\nNro Articulos: "+NroArticulos;  
     }
}
