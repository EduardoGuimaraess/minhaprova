import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListJogador {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            ArrayList<Jogador> jogador = new ArrayList<Jogador>();
            int opcao;
            do {
                System.out.println("Cadastrar Jogador 1");
                System.out.println("Votar no Jogador que deve sair da casa 2");
                System.out.println("Sair 3");
                opcao = ler.nextInt();

                if (opcao == 1) {
                    System.out.println("digite o nome do Jogador");
                    String nome = ler.next();
                    Jogador.add(new Jogador(nome));

                } else if (opcao == 2) {
                    System.out.println("Digite o nome do participante que deseja votar");
                    String n = ler.next();
                    int i = 0;
                    for (; i Jogador.size();
                    i++;){
                        if (Jogador.get(i).getNome().equals(n)) {
                            break;
                        }
                    }
                    if (i != Jogador.size()) {
                        Jogador.get(i).Votar();
                    }
                }
            } while (opcao != 3);
        }

    }
}




