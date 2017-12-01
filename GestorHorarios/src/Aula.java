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

public class Aula implements Comparable<Aula>{

    private Hora hora_inicial;
    private Hora hora_final;
    private Professor professor;
    private Salas sala;
    private Turma turma;

    public Aula(int hi,int mi,int hf,int mf,Professor professor,
                       Salas sala, Turma turma) throws IllegalArgumentException{
        
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
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Professor");
        }
       
        if(sala !=null){
              this.sala = sala;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Sala");
        }
                
        if(turma !=null){
              this.turma = turma;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Turma");
        }                
  
    }
   
        public Hora getHora_inicial() {
        return hora_inicial;
    }

    public void setHora_inicial(Hora hora_inicial) {
        this.hora_inicial = hora_inicial;
    }

    public Hora getHora_final() {
        return hora_final;
    }

    public void setHora_final(Hora hora_final) {
        this.hora_final = hora_final;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public int compareTo(Aula o) {
  
    if(true/*TODO CALCULAR INTERVALO e tiver dentro do horario*/){
        if(o.getSala()==this.getSala()
                && o.getTurma()== this.getTurma()
                && o.getProfessor()== this.getProfessor())
        {
            return 0;//A turma e igual a outra
    }        
            
        }else{
            return 1;//A turma e diferente a outra
        }
       return 1;   
    }
}
