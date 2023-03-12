package org.example;

public class SingletonAutoEscola {
    private SingletonAutoEscola() {};
    private static SingletonAutoEscola instance = new SingletonAutoEscola();
    public static SingletonAutoEscola getInstance() {
        return instance;
    }

    private String nomeAluno;
    private String numCpf;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNumCpf() {
        return numCpf;
    }

    public void setNumCpf(String numCpf) {
        this.numCpf = numCpf;
    }
}

