package Dados;

public enum Semestre{

    sem1{
        @Override
        public String toString(){
            return "1º Semestre";
        }
    },
    
    sem2{
        @Override
        public String toString(){
            return "2º Semestre";
        }
    };
}
