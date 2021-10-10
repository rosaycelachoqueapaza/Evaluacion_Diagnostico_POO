
package documento;

public class Documentos {
    
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Documentos(String Nombre) {
        this.Nombre = Nombre;
    }

    
    
    public String toString(){
        String s = "";
        System.out.println("Nombre:          "+Nombre+"\n");
        return s;
    }
    
}
