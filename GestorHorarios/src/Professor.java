
enum Grau_Académico{
    Douturamento,
    Mestrado,
    Licenciamento;
}

public class Professor {
    private String nome;
    private int idade;
    private Grau_Académico grau_Académico;

    public Professor(String nome, int idade,Grau_Académico grau_Académico) {
        if(!nome.isEmpty() && nome.length()>2 && idade<120 && idade>0){
            this.nome = nome;
            this.idade = idade;
            this.grau_Académico = grau_Académico;
        }else{
            throw new RuntimeException("Formatação Errada num dos campos!");
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

    public Grau_Académico getGrau_Académico() {
        return grau_Académico;
    }

    public void setGrau_Académico(Grau_Académico grau_Académico) {
        this.grau_Académico = grau_Académico;
    }

    
    
    
}
