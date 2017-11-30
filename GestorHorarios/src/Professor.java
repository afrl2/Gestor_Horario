
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
        this.nome = nome;
        this.idade = idade;
        this.grau_Académico = grau_Académico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Grau_Académico getGrau_Académico() {
        return grau_Académico;
    }

    public void setGrau_Académico(Grau_Académico grau_Académico) {
        this.grau_Académico = grau_Académico;
    }

    
    
    
}
