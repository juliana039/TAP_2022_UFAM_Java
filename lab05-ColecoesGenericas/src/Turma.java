import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Turma {

    public String nome;
    public String professor;
    public int numAlunos;
    public boolean acessivel;
    public ArrayList<Integer> horarios;

    Turma(){}

    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<Integer>();
    }

    public void addHorario(int horario){
        horarios.add(horario);
    }

    public String getHorariosString(){
        String dia, hora;
        String stringFinal= "";
        int aux, resto;
        Map<String, String> semana = new HashMap<String, String>();
        semana.put("0", "segunda");
        semana.put("1", "terça");
        semana.put("2", "quarta");
        semana.put("3", "quinta");
        semana.put("4", "sexta");

        Map<String, String> hrAula = new HashMap<String, String>();
        hrAula.put("1", "8hs");
        hrAula.put("2", "10hs");
        hrAula.put("3", "12hs");
        hrAula.put("4", "14hs");
        hrAula.put("5", "16hs");
        hrAula.put("6", "18hs");
        hrAula.put("0", "20hs");

        for(int i =0; i<horarios.size(); i++){
            aux = horarios.get(i)/7;
            resto = horarios.get(i)%7;
            if(resto == 0){
                aux --;
            }
            dia =  Integer.toString(aux);
            hora = Integer.toString(resto);

            stringFinal += semana.get(dia) + " "+ hrAula.get(hora);
            if(i != horarios.size()-1){
                stringFinal += ", ";
            }

        }
        return stringFinal;

    }

    public String getDescricao(){
        String a = "Turma: "+nome +"\nProfessor: "+ professor+ "\nNúmero de Alunos: " + numAlunos + "\nHorário: "+ getHorariosString()+ "\nAcessível: ";
        if(acessivel == true){
            a += "sim";
        }else{
            a += "não";
        }
        return a;
    }

}
