package questao1;
//superclasse

import java.util.Set;

public class Aluno {
    protected String nome; //o protected torna os atributos da superclasse visivel as subclasses dele
    protected String matricula; //preciso fazer o get e set para as classes externas que ñ são extensão dessa classe, para que essas classes externas usem o get/set para acessar
                                //os atributos que estão nessa classe
    protected int idade;

    //construtor
    public Aluno(String nome, String matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public void estudar(){
        System.out.println("O aluno está estudando!");
    }

    public String getNome() { 
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}