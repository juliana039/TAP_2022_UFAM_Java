import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida() {
        this.tabela = new Hashtable<>();
    }
    public boolean insere(String palavra, String documento){
        LinkedList<String> p = this.tabela.get(palavra);

        if(p != null){
            if(p.contains(documento)){
                return false;
            }else{
                p.add(documento);
                return  true;
            }
        }
        LinkedList<String> a = new LinkedList<>();
        a.add(documento);

        this.tabela.put(palavra, a);
        return true;

    }

    public LinkedList<String> busca(String palavra){
        LinkedList<String> p = tabela.get(palavra);
        return p;
    }

    public String toString(){
        return tabela.toString();
    }


}
