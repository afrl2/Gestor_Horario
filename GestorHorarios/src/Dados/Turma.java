package Dados;


enum TipoTurma{
    Prática,
    Teórica,
    Teórica_ou_Prática;
}

public class Turma implements Comparable<Turma> {
    
    private int numero;
    private String disciplina;
    private TipoTurma tipoTurma;
    private Dados dados;

    public Turma(Dados dados ,int numero ,String disciplina ,TipoTurma tipoTurma)
                                                throws IllegalArgumentException
    {
        
        this.dados=dados;
        
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
        
        int flag=0;
        
        for(int i=0;i<dados.getTurmas().size();i++){
            if(dados.getTurmas().get(i).compareTo(this)==1){
                flag=1;
            }
        }
        
        if(flag!=1){
             dados.getTurmas().add(this);
        }
           
    }
    
    public TipoTurma getTipoTurma() {
        return tipoTurma;
    }

    public void setTipoTurma(TipoTurma tipoTurma) {
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
        
    public void removeSalas(){
        
        if(dados.getTurmas().remove(this)){
            
            for(int i=0;i<dados.getAulas().size();i++){
                
                if(dados.getAulas().get(i).getTurma().compareTo(this)==1){
                    dados.getAulas().remove(i);
                }            
            }            
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Turma))
            return false;
        
        if(((Turma)obj).getDisciplina()==this.getDisciplina() && ((Turma)obj).getNumero()==this.getNumero() &&
                ((Turma)obj).getTipoTurma()==this.getTipoTurma())
            return true;
        return false;
            
    }

}
