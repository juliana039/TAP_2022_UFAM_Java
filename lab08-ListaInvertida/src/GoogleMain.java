public class GoogleMain {
    public static void main(String[] args) {
        ListaInvertida listaInvertida = new ListaInvertida();
        listaInvertida.insere("force", "document1");
        listaInvertida.insere("force", "document2");
        listaInvertida.insere("force", "document3");
        listaInvertida.insere("force", "document3");
        listaInvertida.insere("always", "document1");
        listaInvertida.insere("one", "document3");
        listaInvertida.insere("is", "document2");
        listaInvertida.insere("is", "document3");
        listaInvertida.insere("be", "document1");

        System.out.println(listaInvertida.busca("force"));
        System.out.println(listaInvertida.busca("always"));
        System.out.println(listaInvertida.busca("one"));
        System.out.println(listaInvertida.toString());
    }
}
