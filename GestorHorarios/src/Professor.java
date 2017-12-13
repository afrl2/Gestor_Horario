
enum GrauAcadémico{
    Douturamento,
    Mestrado,
    Licenciamento;
}

public class Professor {
    private String nome;
    private int idade;
    private GrauAcadémico grau_Académico;
    private Dados dados;
    
    public Professor(Dados dados, String nome, int idade,
            GrauAcadémico grau_Académico)throws IllegalArgumentException {
       
        this.dados=dados;
        
        if(!nome.isEmpty() && nome.length()>2){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo nome");
        }
        if( (idade<120 && idade>0)){
            this.idade = idade;
        }else{
            throw new IllegalArgumentException("Formatação errada"
                    + " no campo idade");
        }
        
        this.grau_Académico = grau_Académico;
       
        int flag=0;
        
        for(int i=0;i<dados.getProfessores().size();i++){
            if(dados.getProfessores().get(i).equals(this)){
                flag=1;
            }
        }
        
        if(flag!=1){
               dados.getProfessores().add(this);
        } 
  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty() && nome.length()>2){
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<120 && idade>0){
            this.idade = idade;
        }    
    }

    public GrauAcadémico getGrauAcadémico() {
        return grau_Académico;
    }

    public void setGrauAcadémico(GrauAcadémico grau_Académico) {
        this.grau_Académico = grau_Académico;
    }

    public void remove_professor(){
        
        if(dados.getProfessores().remove(this)){
            
            for(int i=0;i<dados.getProfessores().size();i++){
                
                if(dados.getAulas().get(i).getProfessor().equals(this)){
                    dados.getAulas().remove(i);
                }            
            }            
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Professor))
            return false;
        
        if(((Professor)obj).getNome()==this.getNome() 
                && ((Professor)obj).getIdade()==this.getIdade()
                        && ((Professor)obj).getGrauAcadémico()==this.getGrauAcadémico())
            return true;
        
        return false;
    }  
}
