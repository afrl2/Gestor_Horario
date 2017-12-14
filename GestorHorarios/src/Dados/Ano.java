package Dados;

public enum Ano{
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
