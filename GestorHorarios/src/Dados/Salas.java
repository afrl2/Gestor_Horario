package Dados;

import Dados.Dados;
import java.io.Serializable;

public class Salas implements Comparable<Salas>, Serializable {
    
    private Departamentos departamento;
    private int numero;
    private Dados dados;
     
    public Salas(Dados dados,Departamentos departamento, int numero)
            throws IllegalArgumentException{
       
        this.dados=dados;
        
        if (departamento!=null){
             this.departamento=departamento;
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Disciplina");
        }
        
        if (numero>0){
            this.numero=numero;
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Número");
        }
        
        int flag=0;
        
        for (int i=0;i<dados.getSalas().size();i++){
            if (dados.getSalas().get(i).compareTo(this)==1){
                flag=1;
            }
        }
        
        if (flag!=1){
            dados.getSalas().add(this); 
        }
              
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Salas o) {
        
          if (o.getNumero()== this.getNumero()
                && o.getDepartamento()== this.getDepartamento())
        {
            return 1;//A turma e igual a outra

        }else{
            return 0;//A turma e diferente a outra
        }
        
    }
    
    public void removeSalas(){
        
        if (dados.getSalas().remove(this)){
            
            for (int i=0;i<dados.getAulas().size();i++){
                
                if (dados.getAulas().get(i).getSala().compareTo(this)==1){
                    dados.getAulas().remove(i);
                }            
            }            
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Salas))
            return false;
        
        if (((Salas)obj).getDepartamento()==this.getDepartamento() && ((Salas)obj).getNumero()==this.getNumero())
            return true;
        return false;
            
    }
}
