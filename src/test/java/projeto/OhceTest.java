package projeto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class OhceTest {
    Ohce sut = new Ohce();

    @Test
    @DisplayName("Deve retornar true se a palavra for um palíndromo")
    public void PalavraPalindroma(){

        Assertions.assertTrue(sut.ohce("arara"));

    }

    @Test
    @DisplayName("Deve retornar false se a palavra não for um palíndromo")
    public void PalavraNaoPalindroma(){

        Assertions.assertFalse(sut.ohce("casa"));

    }
}
