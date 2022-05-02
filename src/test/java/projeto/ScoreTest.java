package projeto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class ScoreTest {
    ScoreBoard sut = new ScoreBoard();

    @Test
    @DisplayName("Deverá Retornar o Placa do jogo de 001:000")
    public void PlacarDe1x0(){
        
        sut.scoreTeamA1();

        String resposta = sut.getScore();

        Assertions.assertEquals("001:000", resposta);
    }

    @Test
    @DisplayName("Deverá Retornar o Placa do jogo de 002:000")
    public void PlacarDe2x0(){
        
        sut.scoreTeamA2();

        String resposta = sut.getScore();

        Assertions.assertEquals("002:000", resposta);
    }

    @Test
    @DisplayName("Deverá Retornar o Placa do jogo de 003:000")
    public void PlacarDe3x0(){
        
        sut.scoreTeamA3();

        String resposta = sut.getScore();

        Assertions.assertEquals("003:000", resposta);
    }

    @Test
    @DisplayName("Deverá Retornar o Placa do jogo de 003:001  ")
    public void PlacarDe3x1(){
        
        sut.scoreTeamA3();
        sut.scoreTeamB1();   

        String resposta = sut.getScore();

        Assertions.assertEquals("003:001", resposta);
    }

    @Test
    @DisplayName("Deverá Retornar o Placa do jogo de 003:002   ")
    public void PlacarDe3x2(){
        
        sut.scoreTeamA3();
        sut.scoreTeamB2();   

        String resposta = sut.getScore();

        Assertions.assertEquals("003:002", resposta);
    }

    @Test
    @DisplayName("Deverá Retornar o Placa do jogo de 003:003")
    public void PlacarDe3x3(){
        
        sut.scoreTeamA3();
        sut.scoreTeamB3();   

        String resposta = sut.getScore();

        Assertions.assertEquals("003:003", resposta);
    }

    @Test
    @DisplayName("Deverá Retornar o Placa do jogo de 999:9999")
    public void PlacarDe999x999(){
        
        sut.time1 = 999;
        sut.time2 = 999;

        String resposta = sut.getScore();

        Assertions.assertEquals("999:999", resposta);
    }

    @Test
    @DisplayName("Deverá Retornar um erro se o placar ultrapassar de 999")
    public void MaiorDe999(){
        
        sut.time1 = 1000;
        sut.time2 = 1000;

        String resposta = sut.getScore();

        Assertions.assertEquals("não poderá ultrapassar 999", resposta);
    }

}
