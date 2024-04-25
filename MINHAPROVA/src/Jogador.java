
public class Jogador {
    String nome;
    int votos;

    public Jogador(String nome){
        this.nome = nome;
    }

    public static void add(Jogador jogador) {
    }

    public static Jogador get(int i) {
    }

    public void Votar(){
        votos++;
    }

    public int getVotos() {
        return votos;
    }

    public String getNome() {
        return nome;
    }
}

