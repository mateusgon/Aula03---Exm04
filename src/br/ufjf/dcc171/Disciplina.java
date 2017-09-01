package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Integer numero;
    private List<Pessoa> alunos = new ArrayList<>();
            
    public Disciplina() {
        numero = 0;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Pessoa> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Pessoa> alunos) {
        this.alunos = alunos;
    }

    
    
}
