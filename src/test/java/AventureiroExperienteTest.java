import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AventureiroExperienteTest{
    @Test
    void deveRetornarSaudavel(){
        AventureiroExperiente aventureiro = new AventureiroExperiente();
        aventureiro.setDanoRecebido(200);
        aventureiro.setDefesa(100);
        assertEquals("Saudável", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarDebilitado(){
        AventureiroExperiente aventureiro = new AventureiroExperiente();
        aventureiro.setDanoRecebido(400);
        aventureiro.setDefesa(100);
        assertEquals("Debilitado", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarMorto(){
        AventureiroExperiente aventureiro = new AventureiroExperiente();
        aventureiro.setDanoRecebido(600);
        aventureiro.setDefesa(100);
        assertEquals("Morto", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarInformacoes(){
        AventureiroExperiente aventureiro = new AventureiroExperiente();
        aventureiro.setDanoRecebido(400);
        aventureiro.setDefesa(100);
        aventureiro.setNome("Fulano");
        assertEquals("AventureiroExperiente{nome='Fulano', saúde=Debilitado}", aventureiro.getInfo());
    }
}
