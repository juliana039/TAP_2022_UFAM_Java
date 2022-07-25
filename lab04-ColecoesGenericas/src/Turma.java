import java.util.ArrayList;
import java.util.Calendar;

public class Turma {
    public String disciplina;
    public int ano;
    public  int semestre;
    public Professor professor;
    public ArrayList<Aluno> alunos;

    public Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }
    public void addAluno(Aluno aluno){
        if(this.getAluno(aluno.matricula)==null)
        alunos.add(aluno);
    }

    public Aluno getAluno(int matricula){
        int i;
        for(i = 0; i < alunos.size(); i++){
            if(alunos.get(i).matricula== matricula){
                return alunos.get(i);
            }
        }
        return null;
    }

    public double getMediaIdade(){
        int i, soma = 0;
        for(i = 0; i < alunos.size(); i++){
            soma = soma+alunos.get(i).getIdade();
        }
        double media = (double) soma/alunos.size();
        return media;
    }

    public String getDescricao(){
        int i;
        int x = 1;
        String a = "Turma " + disciplina + " - " + ano + "/" + semestre + " (" + professor.getDescricao()+ "):\n";

        for(i = 0; i < alunos.size(); i++){
            a = a + "  - Aluno " + x + ": " + alunos.get(i).getDescricao() +"\n";
            x++;
        }

        return a;
    }

}
