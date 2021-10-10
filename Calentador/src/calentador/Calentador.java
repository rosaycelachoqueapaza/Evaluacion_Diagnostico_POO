package calentador;

import java.util.Scanner;

public class Calentador {

    private final int TemperaturaMax = 100;
    private final int TemperaturaMin = 0;

    private int opcion;

    private int Temperatura;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public int getTemperaturaMax() {
        return TemperaturaMax;
    }

    public int getTemperaturaMin() {
        return TemperaturaMin;
    }

    Scanner ingresar = new Scanner(System.in);

    public Calentador(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public void calentar() {
        System.out.println("\nLa temperatura actual de el agua es: " + this.getTemperatura() + "ºC");
        System.out.println("\ncalentando...");
        System.out.println("\n......");
        this.setTemperatura(this.getTemperaturaMax());
        System.out.println("\n¡¡¡SE AH ALCANZADO LA TEMPERATURA MAXIMA!!! " + this.getTemperatura() + "ºC");
    }

    public void enfriar() {
        System.out.println("\nLa temperartura actual de el agua es: " + this.getTemperatura() + "ºC");
        System.out.println("\nenfriando....");
        System.out.println("\n......");
        this.setTemperatura(this.getTemperaturaMin());
        System.out.println("\nSE ALCANZO LA TEMPERATURA MINIMA!!!!!!   " + this.getTemperatura() + "ºC");
    }

    public void mantener() {
        System.out.println("Manteniendo Temperatura  " + this.getTemperatura() + "ºC");
    }
    
    public void error(){
        System.out.println("Eliga una opcion Correcta");
    }
    public void salir(){
        
    }

    public void menu() {
        System.out.println("\n\nCALENTADOR");
        System.out.println("1.- Calentar");
        System.out.println("2.- Enfriar");
        System.out.println("3.- Mantener Temperatura");
        System.out.println("4.- Salir");
        System.out.println("ELIJA UNA OPCION... ");

        this.setOpcion(ingresar.nextInt());

        if (this.getOpcion() < 1 || this.getOpcion() > 4) {
            this.setOpcion(5);
        }

        switch (this.getOpcion()) {
            case 1:
                calentar();
                menu();
                break;
            case 2:
                enfriar();
                menu();
                break;
            case 3:
                mantener();
                menu();
                break;
            case 4:
                break;
            case 5:
                error();
                menu();
                break;
        }

    }
}
