
package documento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Objetos O = new Objetos(30);

        Documentos doc1 = new Documentos("");
        int opcion;

        do {

            Scanner en = new Scanner(System.in);

            System.out.println("DOCUMENTOS");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            opcion = en.nextInt();

            switch (opcion) {
                case 1:
                    agregar(O);
                    break;
                case 2:
                    O.VerDoc();
                    break;
                case 3:
                    modoficar(O);
                    break;
                case 4:
                    eliminarDoc(O);
                    break;
                case 5:
                    opcion = 5;
                    break;
            }

        } while (opcion != 5);
    }

    private static void agregar(Objetos O) {
        Scanner en = new Scanner(System.in);
        String Nombre;
        String CI;

        System.out.println("Nombre del Documento: ");
        Nombre = en.nextLine();
        O.agregarDoc(new Documentos(Nombre));
    }

    private static void buscar(Objetos O) {
        Scanner en = new Scanner(System.in);
        String Nombre;

        System.out.println("Ingrese el nombre: ");
        Nombre = en.nextLine();

        Documentos aux = O.buscar(Nombre);

        if (aux != null) {
            System.out.println(aux.toString());
        } else {
            System.out.println("No existe el documento");
        }
    }

    private static void modoficar(Objetos O) {
        Scanner en = new Scanner(System.in);
        String Nombre;
        String Nuevo;

        System.out.println("Documento a modificar: ");

        Nombre = en.nextLine();

        Documentos aux = O.buscar(Nombre);
        if (aux != null) {
            System.out.println("Nombre Nuevo del Documento");
            Nuevo = en.nextLine();
            aux.setNombre(Nuevo);
        } else {
            System.out.println("No existe el documento");
        }
    }
    private static void eliminarDoc(Objetos C) {
        Scanner en = new Scanner(System.in);
        String Nombre;

        System.out.println("Documento a Eliminar");

        Nombre = en.nextLine();

        if (C.eliminar(Nombre)) {
        } else {
            System.out.println("No existe el documento");
        }

    }
    
    
}
