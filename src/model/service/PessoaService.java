package model.service;

import model.entity.Pessoa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PessoaService {

    private static int id;
    Set<Pessoa> bancoDeDados = new HashSet<>();

    // CRUD

    public void criar(){
        Pessoa p = new Pessoa();
        p.setId(id++);
        p.setNome(IO.readln("Digite o seu Nome: "));
        p.setEmail(IO.readln("Digite o seu E-mail: "));
        p.setSenha(IO.readln("Digite a sua Senha: "));
        bancoDeDados.add(p);
    }

}
