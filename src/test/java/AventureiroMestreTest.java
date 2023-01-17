import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AventureiroMestreTest {
    @Test
    void deveRetornarSaudavel(){
        AventureiroMestre aventureiro = new AventureiroMestre();
        aventureiro.setDanoRecebido(200);
        aventureiro.setDefesa(100);
        assertEquals("Saudável", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarDebilitado(){
        AventureiroMestre aventureiro = new AventureiroMestre();
        aventureiro.setDanoRecebido(1050);
        aventureiro.setDefesa(100);
        assertEquals("Debilitado", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarMorto(){
        AventureiroMestre aventureiro = new AventureiroMestre();
        aventureiro.setDanoRecebido(1100);
        aventureiro.setDefesa(100);
        assertEquals("Morto", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarInformacoes(){
        AventureiroMestre aventureiro = new AventureiroMestre();
        aventureiro.setDanoRecebido(1050);
        aventureiro.setDefesa(100);
        aventureiro.setNome("Fulano");
        assertEquals("AventureiroMestre{nome='Fulano', saúde=Debilitado}", aventureiro.getInfo());
    }
}
