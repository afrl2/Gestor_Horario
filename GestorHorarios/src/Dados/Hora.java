/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.io.Serializable;

public class Hora implements Comparable<Hora>, Serializable{
    private int hora;
    private int minuto; 

    public Hora(int hora, int minuto) throws IllegalArgumentException{
      
      if (hora>=0 && hora<24){
          this.hora = hora;
      } else {
          throw new IllegalArgumentException("Hora inserida inválida");
      }
      
      if (minuto>=0 && minuto<60){
          this.minuto = minuto;
      } else {
          throw new IllegalArgumentException("Minuto inserido inválida");
      }
        
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public int compareTo(Hora o) {
        if (o.getHora() == this.getHora() && o.getMinuto() == this.getMinuto()) {
            return 1;
        }
        return 0;
    }
}
