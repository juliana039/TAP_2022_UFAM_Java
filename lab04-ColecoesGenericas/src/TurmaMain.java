public class TurmaMain {
    public static void main(String [] args){
        Aluno aluno1 = new Aluno("Juliana", 22052570, 2001);
        Professor professor1 = new Professor("Dr.", "Horácio", 1234567);
        Turma turma = new Turma("TAP", 2022, 1, professor1);
        turma.addAluno(aluno1);
        System.out.println(professor1.getDescricao());
    }
}
