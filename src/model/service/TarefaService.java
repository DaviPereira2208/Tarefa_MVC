package model.service;

import model.entity.Status;
import model.entity.Tarefa;
import model.entity.Status;
import java.util.HashSet;
import java.util.Set;

public class TarefaService {

    private static int id;
    Set<Tarefa> bancoDeDados = new HashSet<>();

    //CRUD

    public void criar(){
        Tarefa t = new Tarefa();
        t.setId(id++);
        t.setTitulo(IO.readln("Digite o Titulo: "));
        t.setDescricao(IO.readln("Digite a descrição: "));
        t.setStatus(Status.PENDENTE);
        bancoDeDados.add(t);
    }
}
