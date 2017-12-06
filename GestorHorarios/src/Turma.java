
enum Tipo_Turma{
    Prática,
    Teórica,
    Teórica_ou_Prática;
}

public class Turma implements Comparable<Turma> {
    
    private int numero;
    private String disciplina;
    private Tipo_Turma tipoTurma;

    public Turma(int numero,String disciplina, Tipo_Turma tipoTurma)
                                                throws IllegalArgumentException
    {
        if(numero>0){
            this.numero=numero;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Número");
        }
        
        if(disciplina!=null){
            this.disciplina=disciplina;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo Disciplina");
        }
        
        this.tipoTurma=tipoTurma;
    }
    
    public Tipo_Turma getTipoTurma() {
        return tipoTurma;
    }

    public void setTipoTurma(Tipo_Turma tipoTurma) {
        this.tipoTurma = tipoTurma;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public int compareTo(Turma o) {
       
        if(o.getDisciplina()==this.getDisciplina()
                && o.getNumero()== this.getNumero()
                && o.getTipoTurma()== this.getTipoTurma() )
        {
            return 1;//A turma e igual a outra
            
            
        }else{
            return 0;//A turma e diferente a outra
        }
                 
    }   
    
}
