
package libros;

public class Cartillas extends Padre{
  private String tema;  

    public Cartillas(int codigo, String titulo, String autor, String tema) {
        super(codigo, titulo, autor);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
  @Override
     public String mostrarDatos(){
         System.out.println("\nCARTILLAS");
        return "Codigo: "+codigo+"\nTitulo: "+titulo+"\nAutor: "+autor+"\nTema: "+tema;  
     }
}
