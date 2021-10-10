
package reloj;

import java.util.Scanner;

public class Reloj {
          int horas, minutos, segundos=46;
          
          Scanner leer= new Scanner(System.in);
       

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
     public void ajustarHora(){
              System.out.println("ingresar hora");
              this.setHoras(leer.nextInt());
              System.out.println("ingresar minuto");
              this.setMinutos(leer.nextInt());
              System.out.println(this.getHoras()+":"+this.getMinutos());
          }
   public void reloj() throws InterruptedException{
        
        while(true){
            if(this.getSegundos() == 0){
            if(this.getHoras()<10){
                System.out.print("0");
            }
            System.out.print(this.getHoras()+":");
            
            if(this.getMinutos()<10){
                System.out.print("0");
            }
            System.out.println(this.getMinutos());
            
            }
            this.setSegundos(segundos+1);
            if(this.getSegundos()==60){
                this.setSegundos(0);
                this.setMinutos(minutos+1);
            
                if(this.getMinutos()==60){
                    this.setMinutos(0);
                    this.setHoras(horas+1);
                    if(this.getHoras()==24){
                        this.setHoras(0);
                    }
                }
            }
            
            Thread.sleep(1000);
        }
    }
    
}
