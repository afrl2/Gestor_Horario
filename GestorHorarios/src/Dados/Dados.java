package Dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dados implements Serializable {
   
    List <Horario> horarios;
    List <Turma> turmas;
    List <Salas> salas;
    List <Aula> aulas;
    List <Professor> professores;
    
    public Dados(){
        
        horarios=new ArrayList<>();
        turmas=new ArrayList<>();
        salas=new ArrayList<>();
        aulas=new ArrayList<>();
        professores=new ArrayList<>();
                
    }
    
        public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Salas> getSalas() {
        return salas;
    }

    public void setSalas(List<Salas> salas) {
        this.salas = salas;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    
    public String getHorariosNome(Horario horario,int i){
        int aux=0;
        String resultado;
        
        for (int k=0;k<i;k++){
            if (horario.compareTo(horarios.get(k))==1){
                aux++;
            }
        }
        
        resultado=(horario.getCurso().toString()
                      +" "+horario.getAno()
                      +" "+horario.getSemestre() + " - "
                      + aux);
                
        return resultado;
    }
    
        public String getAulasNome(Aula aula,int i){
        int aux=0;
        String resultado;
        
        for (int k=0;k<i;k++){
            if (aula.compareTo(aulas.get(k))==1){
                aux++;
            }
        }
        
        resultado=(aula.getDia()
                      +" "+aula.getHoraInicialString()
                      +" "+aula.getHoraFinalString() +" "+aula.getProfessor().getNome()
                      +" "+aula.getSala().getNumero()+" "+aula.getTurma().getDisciplina() );
                
        return resultado;
    }
    
        public String getProfessoresNome(Professor prof){
        int aux=0;
        String resultado;
        
        
        resultado=(prof.getNome()
                      +" "+prof.getIdade()
                      +" "+prof.getGrauAcadémico() + " - "
                     );
                
        return resultado;
    }
        public String getTurmasNome(Turma turma,int i){
        int aux=0;
        String resultado;
        
        for (int k=0;k<i;k++){
            if (turma.compareTo(turmas.get(k))==1){
                aux++;
            }
        }
        
        resultado=(turma.getNumero()
                      +" "+turma.getDisciplina()
                      +" "+turma.getTipoTurma() + " - "
                      );
                
        return resultado;
    }
    
    public String getSalasNome(Salas sala){
        
        String resultado;
        resultado=(sala.getDepartamento().toString()
                      +" "+sala.getNumero());
        return resultado;
    }
}
