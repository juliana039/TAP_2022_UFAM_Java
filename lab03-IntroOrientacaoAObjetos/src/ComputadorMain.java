
public class ComputadorMain {
        public static void main(String [] args){
        Processador processador1 = new Processador("Intel", "i7",3.2,8);
        Memoria memoria1 = new Memoria("Kingstone", "DDR4", 8.0, 3.2, 4);
        Disco disco1 = new Disco("Western Digital", "HDD", 4000.0,9600);
        Computador computador1 = new Computador("Dell", processador1, memoria1, disco1);
        System.out.println(computador1.getDescricao());
        }
}
