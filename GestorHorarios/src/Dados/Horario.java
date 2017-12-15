package Dados;

import Dados.Aula;
import Dados.Dados;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Horario implements Comparable<Horario>, Serializable{

    private List<Aula> aulas;
    private Curso curso;
    private Semestre semestre;
    private Ano ano;
    private Dados dados;

    public Horario(Dados dados ,Curso curso ,Semestre semestre ,Ano ano) throws IllegalArgumentException {
        
        boolean flag=curso.toString().contains("Mestrado");
              
        this.dados=dados;
        
        if (curso != null) {
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Curso");
        }

        if (semestre != null) {
            this.semestre = semestre;
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Semestre");
        }

        if (ano != null) {
            if (flag){
                if (ano!=Ano.ano3){
                    this.ano= ano;
                } else {
                    throw new IllegalArgumentException("Formatação errada"
                    + " no campo Ano");
                }
            } else {
                this.ano=ano;
            }
            
        } else {
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Ano");
        }
           
        aulas = new ArrayList<>();
        dados.getHorarios().add(this);   
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public List<Aula> getAulas() {
        return aulas;
    }
    
    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
    
    public boolean adicionarAula(Aula aula){
      
        int flag_comp=0;
        
        for (int i=0;i<aulas.size();i++){
            if (aula.compareTo(aulas.get(i))==1
                    ||aula.VerificarHora(aulas.get(i))==1)
            flag_comp=1;
        }
        
        if (flag_comp==0){
            aulas.add(aula);
            return true;
        } else {
            throw new RuntimeException("ja existe uma aula dentro do intervalo "
                    + "horario pretendido"); 
        }
        
    }
    
    public Boolean removeAula(Aula aula){
        
        return aulas.remove(aula);
        
    }
    public Boolean removeAula(int i){
        
        return aulas.remove(aulas.get(i));
        
    }
    
    public Boolean ApagarHorario(){
        
        return dados.getHorarios().remove(this);
        
    }
    
    public Aula[][] SortHorario(){
        Aula a [][] =new Aula[7][getAulas().size()];
        int aux=0;
        
        for (int i = 0; i < getAulas().size(); i++) {
            if(getAulas().get(i).getDia()==DiaSemana.segunda){
                a[0][aux++]=getAulas().get(i);
            }  
        }
        aux=0;
        for (int i = 0; i < getAulas().size(); i++) {
            if(getAulas().get(i).getDia()==DiaSemana.terca){
                a[1][aux++]=getAulas().get(i);
            }  
        }
        aux=0;
        for (int i = 0; i < getAulas().size(); i++) {
            if(getAulas().get(i).getDia()==DiaSemana.quarta){
                a[2][aux++]=getAulas().get(i);
            }  
        }
        aux=0;
        for (int i = 0; i < getAulas().size(); i++) {
            if(getAulas().get(i).getDia()==DiaSemana.quinta){
                a[3][aux++]=getAulas().get(i);
            }  
        }
        aux=0;
        for (int i = 0; i < getAulas().size(); i++) {
            if(getAulas().get(i).getDia()==DiaSemana.sexta){
                a[4][aux++]=getAulas().get(i);
            }  
        }
        aux=0;
        for (int i = 0; i < getAulas().size(); i++) {
            if(getAulas().get(i).getDia()==DiaSemana.sabado){
                a[5][aux++]=getAulas().get(i);
            }  
        }
        aux=0;
        for (int i = 0; i < getAulas().size(); i++) {
            if(getAulas().get(i).getDia()==DiaSemana.domingo){
                a[6][aux++]=getAulas().get(i);
            }  
        }
        aux=0;
        return a;
    }
    
    @Override
    public int compareTo(Horario o) {
        
        if (this.ano == o.ano 
                && this.curso == o.curso 
                && this.semestre == o.semestre){
            return 1;//turmas como tudo igual menos aulas;
        } else {
            return 0;
        }     
    }
}
