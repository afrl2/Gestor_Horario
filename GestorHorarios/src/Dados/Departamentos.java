package Dados;

public enum Departamentos{
  
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
            return "Departamento de Física e Matemática";
        } 
    },       
}
