
package libros;

public class Enciclopedias extends Padre{
  private int volumen;
  private int numeroPaginas;

    public Enciclopedias(int codigo, String titulo, String autor, int volumen, int numeroPaginas) {
        super(codigo, titulo, autor);
        this.volumen = volumen;
        this.numeroPaginas = numeroPaginas;
    }


    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
  
  @Override
    public String mostrarDatos(){
        System.out.println("\nENCICLOPEDIAS");
        return "Codigo: "+codigo+"\nTitulo: "+titulo+"\nAutor: "+autor+"\nVolumen: "+volumen+"\nNro Paginas: "+numeroPaginas;  
     }
}
