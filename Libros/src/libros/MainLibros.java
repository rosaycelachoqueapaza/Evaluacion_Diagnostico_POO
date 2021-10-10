
package libros;

public class MainLibros {

    public static void main(String[] args) {
        Padre biblioteca[]=new Padre[5];
        
        biblioteca[0]=new Libros(001,"odisea","Carlos cuactemoc",145);
        biblioteca[1]=new Enciclopedias(002,"LAROUSSE","Larousse",343,24);
        biblioteca[2]=new Mapas(003,"Europa","google maps","Norte",564,343);
        biblioteca[3]=new Revista(004,"Hola","Richar",67);
        biblioteca[4]=new Cartillas(005,"ITS","CIES","Salud");
        
        for(Padre Padre: biblioteca){
            System.out.println(Padre.mostrarDatos());
            System.out.println("");
        }
    }
    
}
