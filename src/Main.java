import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> linhas = Leitor.ler("src/alunos.csv");

        for(String linha : linhas) {
            System.out.println(linha);
        }
    }
}
