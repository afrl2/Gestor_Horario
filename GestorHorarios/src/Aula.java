class Hora{
    private int hora;
    private int minuto; 

    public Hora(int hora, int minuto) throws IllegalArgumentException{
      
      if(hora>=0 && hora<24){
          this.hora = hora;
      }else{
          throw new IllegalArgumentException("Hora inserida inválida");
      }
      
      if(minuto>=0 && minuto<61){
          this.minuto = minuto;
      }else{
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
    
}

public class Aula {
   
    private Hora hora_inicial;
    private Hora hora_final;
    private Professor professor;
    private Salas sala;
    private Turma turma;

    public Aula(int hi,int mi,int hf,int mf,Professor professor, Salas sala, Turma turma) throws IllegalArgumentException{
        
        try{
            hora_inicial = new Hora(hi,mi);
        }catch(Exception e){
            throw e;
        }
        
        try{
            hora_final = new Hora(hf,mf);
        }catch(Exception e){
            throw e;
        }
        
        if(professor !=null){
             this.professor = professor;
        }else{
            throw new IllegalArgumentException("Professor inserida inválida");
        }
       
        if(sala !=null){
              this.sala = sala;
        }else{
            throw new IllegalArgumentException("Sala inserida inválida");
        }
                
        if(turma !=null){
              this.turma = turma;
        }else{
            throw new IllegalArgumentException("Turma inserida inválida");
        }                
  
    }
        
}
