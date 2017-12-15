package Dados;

class Hora implements Comparable<Hora>{
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

public class Aula implements Comparable<Aula>{

    private Hora hora_inicial;
    private Hora hora_final;
    private Professor professor;
    private Salas sala;
    private Turma turma;
    private Dados dados;
    private DiaSemana dia;
    
    public Aula(Dados dados,int hi,int mi,int hf,int mf,Professor professor,
                        Salas sala, Turma turma,DiaSemana semana) 
                        throws IllegalArgumentException{
       
        this.dados=dados;
        
        try{
            hora_inicial = new Hora(hi,mi);
        } catch (Exception e){
            throw e;
        }
        
        try{
            hora_final = new Hora(hf,mf);
        } catch (Exception e){
            throw e;
        }
        
        if (professor != null){
             this.professor = professor;
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Professor");
        }
       
        if (sala != null){
              this.sala = sala;
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Sala");
        }
                
        if (turma !=null){
              this.turma = turma;
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Turma");
        }                
        this.dia=semana;
        
        int flag=0;
        
        for (int i=0;i<dados.getAulas().size();i++){
            if (dados.getAulas().get(i).compareTo(this)==1){
                flag=1;
            }
        }
        
        if (flag!=1){
             dados.getAulas().add(this);
        }
        
    }
   
    public Hora getHoraInicial() {
        return hora_inicial;
    }
    
    public String getHoraInicialString(){
        return hora_inicial.getHora() + ":" + hora_inicial.getMinuto();
    }

    public void setHoraInicial(Hora hora_inicial) {
        if (hora_inicial.getHora()<25 && hora_inicial.getHora()>0 
                && hora_inicial.getMinuto()<=59 && hora_inicial.getMinuto()>=0 
                && hora_inicial.getHora()*60+hora_inicial.getMinuto()
                    <this.hora_final.getHora()*60+hora_final.getMinuto()){
         this.hora_inicial = hora_inicial;   
        }
        
    }

    public Hora getHoraFinal() {
        return hora_final;
    }
    
    public String getHoraFinalString(){
        return hora_final.getHora() + ":" + hora_final.getMinuto();
    }

    public void setHoraFinal(Hora hora_final) {
        if (hora_final.getHora()<25 && hora_final.getHora()>0 
                && hora_final.getMinuto()<=59 && hora_final.getMinuto()>=0 
                && this.getHoraInicial().getHora()*60+this.getHoraInicial().getMinuto()
                    <hora_final.getHora()*60+hora_inicial.getMinuto()){
            this.hora_final = hora_final;
        }
            
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

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    @Override
    public int compareTo(Aula o) {
        
        if (o.getSala()==this.getSala()
                && o.getTurma()== this.getTurma()
                && o.getProfessor()== this.getProfessor()
                && o.getHoraInicial().compareTo(this.getHoraInicial())==1
                && o.getHoraFinal().compareTo(this.getHoraFinal())==1
                && o.getDia()==this.getDia())
        {            
            return 1;//A turma e igual a outra
        }        

       return 0;   
    }
    
    public int VerificarHora(Aula o){
    
        int hora_i = this.getHoraInicial().getHora()
                * 60 + this.getHoraInicial().getMinuto();
        int hora_f = this.getHoraFinal().getHora()
                * 60 + this.getHoraFinal().getMinuto();
        int ohora_i = o.getHoraInicial().getHora()
                * 60 + o.getHoraInicial().getMinuto();
        int ohora_f = o.getHoraFinal().getHora()
                * 60 + o.getHoraFinal().getMinuto();

        if (this.getDia()==o.getDia()){
        
            if (hora_i >= ohora_i && hora_i <= ohora_f
                    && hora_f >= ohora_i && hora_f <= ohora_f) {

                return 1;
            }   
        }
        return 0;
    }
    
    public Boolean removeAula(){
        
       return dados.getAulas().remove(this);    
    }

    public String getAulaNome(){
        String resultado;
 
        resultado=(this.getDia()
                      +" "+this.getHoraInicialString()
                      +" "+this.getHoraFinalString() +" "+this.getProfessor().getNome()
                      +" "+this.getSala().getNumero()+" "+this.getTurma().getDisciplina() );
                
        return resultado;
    }
}
