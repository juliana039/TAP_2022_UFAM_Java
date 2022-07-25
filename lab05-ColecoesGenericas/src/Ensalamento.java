import java.util.ArrayList;

public class Ensalamento {
    public ArrayList<Sala> salas;
    public ArrayList<Turma> turmas;
    public ArrayList<TurmaEmSala> ensalamento;

    public Ensalamento(){
        this.ensalamento= new ArrayList<TurmaEmSala>();
        this.turmas = new ArrayList<Turma>();
        this.salas = new ArrayList<Sala>();
    }

    public void addSala(Sala sala){
        //if(this.getAluno(aluno.matricula)==null)
        salas.add(sala);
    }

    public void addTurma(Turma turma){
        turmas.add(turma);
    }

    public Sala getSala(Turma turma){
        if(ensalamento ==null) {
            return null;
        }

        for(int i = 0; i<ensalamento.size(); i++){
            if(turma == ensalamento.get(i).turma){
                return ensalamento.get(i).sala;
            }
        }
        return null;
    }

    public boolean salaDisponivel(Sala sala, int horario){
        for(int i = 0; i<ensalamento.size(); i++){
            if(sala == ensalamento.get(i).sala){
                for(int j = 0; j<turmas.get(i).horarios.size(); j++){
                    if(horario == turmas.get(i).horarios.get(j)){ //sala já está ocupada
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios){
        for(int i = 0; i<horarios.size(); i++){
            if(salaDisponivel(sala, horarios.get(i)) == false ){
                return false;
            }
        }
        return true;
    }

    public boolean alocar(Turma turma, Sala sala){
        if(sala.acessivel==true && turma.acessivel ==true && turma.numAlunos <= sala.capacidade && salaDisponivel(sala, turma.horarios)){
            TurmaEmSala turmaEmSala = new TurmaEmSala(turma, sala);
            ensalamento.add(turmaEmSala);
            return true;
        }
        return false;
    }

    public void alocarTodas(){
        for (int i =0; i < turmas.size(); i++){
            for (int j = 0; j < salas.size(); j++){
                if(alocar(turmas.get(i), salas.get(j)) == true) {
                    break;
                }
            }
        }
    }

    public int getTotalTurmasAlocadas(){
        int cont = 0 ;
        for (int i =0; i< ensalamento.size(); i++){
            if(ensalamento.get(i).sala != null){
                cont++;
            }
        }
        return cont;
    }

    public int getTotalEspacoLivre(){
        int cont = 0;
        for (int i =0; i< ensalamento.size(); i++){
            cont+= ensalamento.get(i).sala.capacidade - ensalamento.get(i).turma.numAlunos;
        }
        return cont;
    }

    public String relatorioResumoEnsalamento(){
        String a = "Total de Salas: "+ salas.size()+"\nTotal de Turmas: "+turmas.size() + "\nTurmas Alocadas: "+ getTotalTurmasAlocadas() + "\nEspaços Livres: "+getTotalEspacoLivre();
        return a;
    }

    public String relatorioTurmasPorSala(){
        String a = relatorioResumoEnsalamento()+ "\n";

        for (int i = 0; i< salas.size(); i++){
            a += "\n--- "+ salas.get(i).getDescricao() + " ---\n";
            for (int j = 0; j< turmas.size(); j++){
                if(this.salas.get(i) == this.getSala(this.turmas.get(j))){
                    a += "\n"+ turmas.get(i).getDescricao() ;
                }
            }
        }

        return a;
    }

    public String relatorioSalasPorTurma(){
        String a = relatorioResumoEnsalamento()+ "\n";

        for (int i = 0; i< turmas.size(); i++){
            a += "\n"+ turmas.get(i).getDescricao()+"\nSala: " ;

            for (int j = 0; j< turmas.size(); j++){
                if(this.salas.get(i) == this.getSala(this.turmas.get(j))){
                    a += "\n"+ salas.get(i).getDescricao() ;
                }else{
                    a += "\nSEM SALA";
                }
            }

        }
        return a;
    }




}
