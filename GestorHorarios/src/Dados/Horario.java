package Dados;


import Dados.Aula;
import Dados.Dados;
import java.util.ArrayList;
import java.util.List;

enum Curso{
    //Licenciaturas
    Lic_EngBiol  {
        @Override
        public String toString(){
            return "Engenharia Biológica";
        }
    },
    
    Lic_EngBiom  {
        @Override
        public String toString(){
            return "Engenharia Biomédica - Bioeletrónica";
        }
    },
    
    Lic_EngCivil  {
        @Override
        public String toString(){
            return "Engenharia Civil";
        }
    },
    
    Lic_EngElectrmec  {
        @Override
        public String toString(){
            return "Engenharia Electromecânica";
        }
    },
    
    Lic_EngElecttec  {
        @Override
        public String toString(){
            return "Engenharia Electrotécnica";
        }
    },
    
    Lic_EngGI  {
        @Override
        public String toString(){
            return "Engenharia e Gestão Industrial";
        }
    },
    
    Lic_EngInf  {
        @Override
        public String toString(){
            return "Engenharia Informática";
        }
    },
    
    Lic_EngInfEU  {
        @Override
        public String toString(){
            return "Engenharia Informática - Curso Europeu";
        }
    },
    
    Lic_EngQui  {
        @Override
        public String toString(){
            return "Engenharia Química";
        }
    },
    
    Lic_EngMec  {
        @Override
        public String toString(){
            return "Engenharia Mecânica";
        }
    },
    
    Lic_BioEng  {
        @Override
        public String toString(){
            return "Bioengenharia ";
        }
    },
//Mestrados    
    Mest_ComE  {
        @Override
        public String toString(){
            return "Mestrado em Comércio Electrónico";
        }
    },
    
    Mest_EngCiv  {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Civil - Especialização em Contrução Urbana";
        }
    },
    
    Mest_EngElectrtec  {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Electrotécnica";
        }
    },
        
    Mest_EngElectrmec  {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Eletromecânica";
        }
    },
    
    Mest_EngGI {
        @Override
        public String toString(){
            return "Mestrado em Engenharia e Gestão Industrial";
        }
    },
    
    Mest_EngMec {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Mecânica";
        }
    },
    
    Mest_Erasmus {
        @Override
        public String toString(){
            return "Mestrado Erasmus Mundus - Mobilidade Elétrica e Sistemas"
                    + " de Energia";
        }
    },
    
    Mest_InfSis {
        @Override
        public String toString(){
            return "Mestrado em Informática e Sistemas";
        }
    },
    
    Mest_InstBio {
        @Override
        public String toString(){
            return "Mestrado em Instrumentação Biomédica";
        }
    },
    
    Mest_ProcQuiBio{
        @Override
        public String toString(){
            return "Mestrado em Processos Químicos e Biológicos";
        }
    };
    
}


enum Semestre{

    sem1{
        @Override
        public String toString(){
            return "1ºSemestre";
        }
    },
    
    sem2{
        @Override
        public String toString(){
            return "2ºSemestre";
        }
    };
}


enum Ano{
    ano1{
        @Override
        public String toString(){
            return "1º Ano";
        }
    },
    
    ano2{
        @Override
        public String toString(){
            return "2º Ano";
        }
    },
    
    ano3{
        @Override
        public String toString(){
            return "3º Ano";
        }
    };
}

public class Horario implements Comparable<Horario>{

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
                if(ano!=Ano.ano3){
                    this.ano= ano;
                }else{
                    throw new IllegalArgumentException("Formatação errada"
                    + " no campo Ano");
                }
            }else{
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
        
        for(int i=0;i<aulas.size();i++){
            if(aula.compareTo(aulas.get(i))==1
                    ||aula.VerificarHora(aulas.get(i))==1)
            flag_comp=1;
        }
        
        if(flag_comp==0){
            aulas.add(aula);
            return true;
        }else{
            return false;
        }
        
    }
    
    public Boolean removeAula(Aula aula){
        
        return aulas.remove(aula);
        
    }
        
    public Boolean ApagarHorario(){
        
        return dados.getHorarios().remove(this);
        
    }

    @Override
    public int compareTo(Horario o) {
        if (this.ano == o.ano 
                && this.curso == o.curso 
                && this.semestre == o.semestre){
            return 1;//turmas como tudo igual menos aulas;
        }else{
            return 0;
        }     
    }
}
