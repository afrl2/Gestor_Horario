package Dados;

public enum TipoTurma{
    Prática,
    Teórica,
    Teórica_ou_Prática{
                @Override
        public String toString(){
            return "Teórica ou Prática";
        }
    };
}
