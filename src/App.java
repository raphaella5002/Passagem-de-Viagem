import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");

        List <Estado> estados = new ArrayList <>();

        estados.add(new Estado("São Paulo"));
        estados.add(new Estado("Rio de Janeiro"));
        estados.add(new Estado("Minas Gerais"));
        estados.add(new Estado("Goiás"));
        estados.add(new Estado("Santa Catarina"));
        estados.add(new Estado("Minas Gerais"));
        estados.add(new Estado("Rio Grande do Norte"));

        System.out.println("Escolha o estado desejado para viagem: ");
        for(int i = 0; i < estados.size(); i ++){
            System.out.println((i + 1) + ". " + estados.get(i).getNome());
        }

        int escolher = scanner.nextInt();
        scanner.nextLine();

        String estadoEscolhido = "";

        switch (escolher) {
            case 1:
                estadoEscolhido = estados.get(0).getNome();
                break;
            case 2:
                estadoEscolhido = estados.get(1).getNome(); 
                break;
            case 3:
                estadoEscolhido = estados.get(2).getNome();
                break;
            case 4:
                estadoEscolhido = estados.get(3).getNome();
                break;
            case 5: 
                estadoEscolhido = estados.get(4).getNome();
                break;
            case 6:
                estadoEscolhido = estados.get(5).getNome();
                break;
            case 7:
                estadoEscolhido = estados.get(6).getNome();
                break;

            default:
                System.out.println("Opção Inválida!");
                scanner.close();
                return;
        }

            System.out.println("Você escolheu: " + estadoEscolhido + " como estado para viagem.");

            System.out.println("Digite o nome da cidade desejada: ");
            String cidadeEscolhida = scanner.nextLine();

            System.out.println("Você escolher viajar para " + cidadeEscolhida + ", no estado de " + estadoEscolhido);

            scanner.close();
        }
}
