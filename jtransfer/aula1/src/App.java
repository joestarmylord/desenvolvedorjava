import java.io.FileWriter; // classe para escrever no arquivo
import java.io.IOError; // classe para tratar exceções do arquivo
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome; // referência
        int opcaoTransporte; // camelCasing
        String meioTransporte = ""; 

        // classe para teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("==Pesquisa de Transporte Diário");
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println(nome);
        // utf-8 
        System.out.println("Como você vai ao trabalho?");
        System.out.println("1-Metrô");
        System.out.println("2-Ônibus");
        System.out.println("3-Caminhada");
        System.out.println("4-Uber");
        System.out.println("5-Táxi");
        System.out.println("6-Carro");
        System.out.println("Escolha uma opção (1~6)");

        // Exercicio
        // Leia a opção transporte e mostre a opção lida
        // casting (conversão) = texto/número (string/int)
        opcaoTransporte = scanner.nextInt();
        System.out.println(opcaoTransporte);

        switch (opcaoTransporte) {
            case 1:
                meioTransporte = "Metrô";break;
            case 2:
                meioTransporte = "Ônibus";break;
            case 3:
                meioTransporte = "Caminhada";break;
            case 4:
                meioTransporte = "Uber";break;
            case 5:
                meioTransporte = "Táxi";break;
            case 6:
                meioTransporte = "Carro";break;
        }

        // tarefa de amanhâ salvar os dados no arquivo.
        // salvar no git/github.
        System.out.println("Nome:"+nome+","+"Meio de Transporte: "+meioTransporte);

        try (FileWriter escritor = new FileWriter("dados.txt",true)) {

            escritor.write(nome+","+meioTransporte+"\n");
            System.out.println("Dados gravados com sucesso!");
            
        } catch (IOException e) {
            System.out.println("Erro ao gravar os dados"+e.getMessage());
        }
    }
}

