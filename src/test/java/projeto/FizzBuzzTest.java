package projeto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

class FizzBuzzTest {
    
    FizzBuzzWhiz sut = new FizzBuzzWhiz();
    
    @Test
    @DisplayName("Deverá Retornar FizzWhizz se o número for primo e divisivel por 3")
    public void PrimoDivisivel3(){
        
        String result = sut.fizzBuzzWhiz(3);
    
        Assertions.assertEquals("fizzwhiz", result);
    }
    
    @Test
    @DisplayName("Deverá Retornar BuzzWhizz se o número for primo e divisivel por 5")
    public void PrimoDivisivel5(){
        
        String result = sut.fizzBuzzWhiz(5);
    
        Assertions.assertEquals("buzzwhiz", result);
    }
    
    @Test
    @DisplayName("Deverá Retornar FizzBuzz se o número for multiplo de 3 e 5 ao mesmo tempo")
    public void MultiploDe3x5(){
        
        String result = sut.fizzBuzzWhiz(15);

        Assertions.assertEquals("fizzbuzz", result);
    }

    @Test
    @DisplayName("Deverá Retornar Fizz se o número for multiplo de 3")
    public void MultiploDe3(){
        
        String result = sut.fizzBuzzWhiz(6);

        Assertions.assertEquals("fizz", result);
    }

    @Test
    @DisplayName("Deverá Retornar Buzz se o número for multiplo de 5")
    public void MultiploDe5(){
        
        String result = sut.fizzBuzzWhiz(20);

        Assertions.assertEquals("buzz", result);
    }

    @Test
    @DisplayName("Deverá Retornar o proprio número se ele não for multiplo de 3 e/ou de 5")
    public void NaoMultiploDe3x5(){
        
        String result = sut.fizzBuzzWhiz(16);

        Assertions.assertEquals("16", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {7,11,13,17,19})
    @DisplayName("Deverá Retornar whiz se o número for primo")
    public void NumeroPrimo(int numero){
        
        String result = sut.fizzBuzzWhiz(numero);

        Assertions.assertEquals("whiz", result);
    }

}
