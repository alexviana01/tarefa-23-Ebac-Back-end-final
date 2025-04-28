



import java.util.*;
import java.util.stream.*;

public class FiltrarMulheres {
    public static class Pessoa {
        private String nome;
        private String genero;

        public Pessoa(String nome, String genero) {
            this.nome = nome;
            this.genero = genero;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        @Override
        public String toString() {
            return nome + ", " + genero;
        }
    }

    public static List<Pessoa> filtrarMulheres(List<Pessoa> listaPessoas) {
        return listaPessoas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
    }
}