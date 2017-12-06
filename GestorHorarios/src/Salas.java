 enum Departamentos{
  
    DEC  {
        public String toString(){
            return "Departamento de Engenharia Civil";
        }
    },
        
    DEIS {
        public String toString(){
            return "Departamento de Engenharia Informática e de Sistemas";
        } 
    },
           
    DEQB {
        public String toString(){
            return "Departamento de Engenharia Química, Biológica"
                    + " e Gestão Industrial";
        } 
    },
        
    DEM {
         public String toString(){
            return "Departamento de Engenharia Mecânica";
        } 
    }, 
   
    DEE {
         public String toString(){
            return "Departamento de Engenharia Electrotécnica";
        } 
    },
    
    DFM {
        public String toString(){
            return "Departamento de Engenharia Electrotécnica";
        } 
    },       
}

public class Salas implements Comparable<Salas> {
    
    private Departamentos departamento;
    private int numero;
    private Dados dados;
     
    public Salas(Dados dados,Departamentos departamento, int numero)
            throws IllegalArgumentException{
       
        this.dados=dados;
        
        if(departamento!=null){
             this.departamento=departamento;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Disciplina");
        }
        
        if(numero>0){
            this.numero=numero;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Número");
        }
        dados.getSalas().add(this);   
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
        
          if(o.getNumero()== this.getNumero()
                && o.getDepartamento()== this.getDepartamento())
        {
            return 1;//A turma e igual a outra

        }else{
            return 0;//A turma e diferente a outra
        }
        
    }
    
    public void remove_salas(){
        
        if(dados.getSalas().remove(this)){
            
            for(int i=0;i<dados.getAulas().size();i++){
                
                if(dados.getAulas().get(i).getSala().compareTo(this)==1){
                    dados.getAulas().remove(i);
                }            
            }            
        }
    }
    
}
