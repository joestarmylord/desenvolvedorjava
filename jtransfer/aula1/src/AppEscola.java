import java.util.Scanner; // importar uma classe externa

public class AppEscola { // PascalCasing
    // public = público
    // static = da classe 
    // void retorno vazio
    // main = principal
    // String args[] = parâmetro inicial
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        System.out.println("Tem faculdade? 0-Não e 1-Sim");
        boolean temFaculdade = teclado.nextBoolean();
        // método principal
        // classe objeto = new Construtor(parâmetro)

        Aluno aluno = new Aluno(nome, idade, temFaculdade);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());

        //implementar uma interface com usuário usando Scanner
    }

}
