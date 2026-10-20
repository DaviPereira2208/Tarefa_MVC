package controller;

import model.service.TarefaService;

public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void criarTabela(){
        tarefaService.criar();
        IO.println("Tarefa criada com Sucesso!!");
    }

    public void criarTarefa() {
        tarefaService.criar();
        IO.println("Tarefa criada com Sucesso!!");
    }
}
