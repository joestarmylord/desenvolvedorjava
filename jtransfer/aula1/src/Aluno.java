// encapsulamento: public, private, protected, package
public class Aluno { // classe

    // variáveis = atributos (orientação objeto)
    // características do objeto
    private String nome; // String = classe, atributo do tipo texto
    private int idade; // int = classe primitiva, classes wrappers, atributo do tipo número
    private boolean temFaculdade; // atributo do tipo booleano (0 e 1)

    public Aluno() { // construtor



    }

    public Aluno(String nome, int idade, boolean temFaculdade) {

        this.nome = nome; // "this." faz diferenciar atributo de classe
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }

    public String getNome() { // método para pegar o nome
        return nome;
    }

    public int getIdade() { // método para pegar a idade
        return idade;
    }

    public boolean getTemFaculdade() { // método para pegar a faculdade
        return temFaculdade;
    }

    // considerando a explicação do professor: tipo primitivo x classe wrappers
    // você tem que descobrir quantos alunos tem faculdade (sim ou não)
    // temFaculdade, sim/não - 0 ou 1
    // como declarar um atributo booleano?


}
