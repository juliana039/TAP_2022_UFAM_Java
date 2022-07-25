public class Sala {
    public int bloco;
    public int sala;
    public int capacidade;
    public boolean acessivel;

    public Sala(){}

    public Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    public  String getDescricao(){
        String a= "Bloco "+ bloco+", Sala "+sala+" ("+capacidade;
        if(acessivel == true){
            a += " lugares, acessível)";
        }else{
            a += " lugares, não acessível)";
        }
        return a;
    }
}
