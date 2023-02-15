import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Leitor {
    public static List<String> ler(String arquivo) {
        Path path = Paths.get(arquivo);

        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
