import java.util.Calendar;

public class Aluno {
    public String nome;
    public int matricula;
    public int anoNascimento;

    Aluno(){}

    public Aluno(String nome, int matricula, int anoNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }
    public int getIdade(){
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        return ano-anoNascimento;
    }

    public String getDescricao(){
        String a = nome + " (mat=" + matricula +", idade="+ getIdade() +")";
        return a;
    }
}
