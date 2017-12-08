
import java.util.ArrayList;
import java.util.List;

enum Curso{
    //Licenciaturas
    Lic_EngBiol  {
        public String toString(){
            return "Engenharia Biológica";
        }
    },
    
    Lic_EngBiom  {
        public String toString(){
            return "Engenharia Biomédica - Bioeletrónica";
        }
    },
    
    Lic_EngCivil  {
        public String toString(){
            return "Engenharia Civil";
        }
    },
    
    Lic_EngElectrmec  {
        public String toString(){
            return "Engenharia Electromecânica";
        }
    },
    
    Lic_EngElecttec  {
        public String toString(){
            return "Engenharia Electrotécnica";
        }
    },
    
    Lic_EngGI  {
        public String toString(){
            return "Engenharia e Gestão Industrial";
        }
    },
    
    Lic_EngInf  {
        public String toString(){
            return "Engenharia Informática";
        }
    },
    
    Lic_EngInfEU  {
        public String toString(){
            return "Engenharia Informática - Curso Europeu";
        }
    },
    
    Lic_EngQui  {
        public String toString(){
            return "Engenharia Química";
        }
    },
    
    Lic_EngMec  {
        public String toString(){
            return "Engenharia Mecânica";
        }
    },
    
    Lic_BioEng  {
        public String toString(){
            return "Bioengenharia ";
        }
    },
//Mestrados    
    Mest_ComE  {
        public String toString(){
            return "Mestrado em Comércio Electrónico";
        }
    },
    
    Mest_EngCiv  {
        public String toString(){
            return "Mestrado em Engenharia Civil - Especialização em Contrução Urbana";
        }
    },
    
    Mest_EngElectrtec  {
        public String toString(){
            return "Mestrado em Engenharia Electrotécnica";
        }
    },
        
    Mest_EngElectrmec  {
        public String toString(){
            return "Mestrado em Engenharia Eletromecânica";
        }
    },
    
    Mest_EngGI {
        public String toString(){
            return "Mestrado em Engenharia e Gestão Industrial";
        }
    },
    
    Mest_EngMec {
        public String toString(){
            return "Mestrado em Engenharia Mecânica";
        }
    },
    
    Mest_Erasmus {
        public String toString(){
            return "Mestrado Erasmus Mundus - Mobilidade Elétrica e Sistemas"
                    + " de Energia";
        }
    },
    
    Mest_InfSis {
        public String toString(){
            return "Mestrado em Informática e Sistemas";
        }
    },
    
    Mest_InstBio {
        public String toString(){
            return "Mestrado em Instrumentação Biomédica";
        }
    },
    
    Mest_ProcQuiBio{
        public String toString(){
            return "Mestrado em Processos Químicos e Biológicos";
        }
    };
    
}


enum Semestre{

    sem1{
        public String toString(){
            return "1ºSemestre";
        }
    },
    
    sem2{
        public String toString(){
            return "2ºSemestre";
        }
    };
}


enum Ano{
    ano1{
        public String toString(){
            return "1º Ano";
        }
    },
    
    ano2{
        public String toString(){
            return "2º Ano";
        }
    },
    
    ano3{
        public String toString(){
            return "3º Ano";
        }
    };
}

public class Horario {

    private List<Aula> aulas;
    private Curso curso;
    private Semestre semestre;
    private Ano ano;
    private Dados dados;

    public Horario(Dados dados ,Curso curso ,Semestre semestre ,Ano ano) throws IllegalArgumentException {
 
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
            this.ano = ano;
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
    
    public boolean adicionar_aula(Aula aula){
      
        int flag_comp=0;
        
        for(int i=0;i<aulas.size();i++){
            if(aula.compareTo(aulas.get(i))==1
                    ||aula.Verificar_hora(aulas.get(i))==1)
            flag_comp=1;
        }
        
        if(flag_comp==0){
            aulas.add(aula);
            return true;
        }else{
            return false;
        }
        
    }
    
    public Boolean remove_aula(Aula aula){
        
        return aulas.remove(aula);
        
    }
        
    public Boolean Apagar_horario(){
        
        return dados.getHorarios().remove(this);
        
    }
}
