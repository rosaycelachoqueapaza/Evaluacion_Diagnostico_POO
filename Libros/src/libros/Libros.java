
package libros;

public class Libros extends Padre{
    
  private int NumeroPagina;  

    public Libros(int codigo, String titulo, String autor, int NumeroPagina) {
        super(codigo, titulo, autor);
        this.NumeroPagina = NumeroPagina;
    }

    public int getNumeroPagina() {
        return NumeroPagina;
    }

    public void setNumeroPagina(int NumeroPagina) {
        this.NumeroPagina = NumeroPagina;
    }
    
  @Override
    public String mostrarDatos(){
        System.out.println("\nLIBROS");
        return "Codigo: "+codigo+"\nTitulo: "+titulo+"\nAutor: "+autor+"\nNro Paginas: "+NumeroPagina;  
     }
}
