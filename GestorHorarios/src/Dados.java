package Dados;


import java.util.ArrayList;
import java.util.List;

public class Dados {
   
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
    
    public String getHorariosNome(Horario horario){
        int aux=0;
        String resultado;
        
        for(int k=0;k<horarios.size();k++){
            if (horario.compareTo(horarios.get(k))==1){
                aux++;
            }
        }
        
        resultado=(aux+" - Curso:" +horario.getCurso().toString()
                      +" Ano:"+horario.getAno()
                      +" Semestre:"+horario.getSemestre());
                
        return resultado;
    }
}
