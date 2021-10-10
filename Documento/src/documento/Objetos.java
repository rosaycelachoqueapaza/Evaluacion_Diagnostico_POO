
package documento;

import java.util.Scanner;

public class Objetos {
    
    private Documentos doc[];
    private int Tam;
    private int Can;

    public Objetos(int n) {
        Tam = n;
        doc = new Documentos[Tam];
        Can = 0;
    }

    public boolean agregarDoc(Documentos n) {
        if (Can < Tam) {
            doc[Can++] = n;
            return true;
        }
        return false;
    }

    public String VerDoc() {
        String s = "";
        for (int i = 0; i < Can; i++) {
            System.out.println(doc[i].toString());
        }
        return s;
    }
    
    public Documentos buscar(String Nombre) {
        for (int i = 0; i < Can; i++) {
            if (doc[i].getNombre().contentEquals(Nombre)) {
                return doc[i];
            }
        }
        return null;
    }
    
    boolean eliminar(String Nombre) {
        for (int i = 0; i < Can; i++) {
            if (doc[i].getNombre().equals(Nombre)) {
                correrIzquierda(i);
                return true;
            }
        }
        return false;
    }

    private void correrIzquierda(int x) {
        for (int i = x; i < Can; i++) {
            doc[i] = doc[i + 1];
        }
        Can--;
    }
}
