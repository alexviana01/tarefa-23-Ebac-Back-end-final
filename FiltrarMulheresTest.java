




import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FiltrarMulheresTest {

    @Test
    public void testApenasMulheres() {
        // Dado
        List<FiltrarMulheres.Pessoa> listaPessoas = Arrays.asList(
            new FiltrarMulheres.Pessoa("Ana", "Feminino"),
            new FiltrarMulheres.Pessoa("Maria", "Feminino"),
            new FiltrarMulheres.Pessoa("João", "Masculino"),
            new FiltrarMulheres.Pessoa("Pedro", "Masculino")
        );

        // Quando
        List<FiltrarMulheres.Pessoa> mulheres = FiltrarMulheres.filtrarMulheres(listaPessoas);

        // Então
        assertFalse(mulheres.isEmpty(), "A lista de mulheres não deve estar vazia");
        assertTrue(mulheres.stream().allMatch(
            p -> p.getGenero().equalsIgnoreCase("Feminino")
        ), "A lista deve conter apenas mulheres");

        // (Opcional) Validar nomes esperados
        List<String> nomesEsperados = Arrays.asList("Ana", "Maria");
        assertEquals(nomesEsperados,
            mulheres.stream().map(FiltrarMulheres.Pessoa::getNome).toList());
    }
}