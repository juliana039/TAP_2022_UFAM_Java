public class Professor {
    public  String titulacao;
    public  String nome;
    public int matricula;

    Professor(){}

    public Professor(String titulacao, String nome, int matricula) {
        this.titulacao = titulacao;
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getDescricao(){
        String a= "Prof. "+ titulacao+" "+nome+" - mat " +matricula ;
        return a;
    }
}
