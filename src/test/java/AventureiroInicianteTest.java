import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AventureiroInicianteTest {
    @Test
    void deveRetornarSaudavel(){
        AventureiroIniciante aventureiro = new AventureiroIniciante();
        aventureiro.setDanoRecebido(150);
        aventureiro.setDefesa(100);
        assertEquals("Saudável", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarDebilitado(){
        AventureiroIniciante aventureiro = new AventureiroIniciante();
        aventureiro.setDanoRecebido(350);
        aventureiro.setDefesa(100);
        assertEquals("Debilitado", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarMorto(){
        AventureiroIniciante aventureiro = new AventureiroIniciante();
        aventureiro.setDanoRecebido(400);
        aventureiro.setDefesa(100);
        assertEquals("Morto", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarInformacoes(){
        AventureiroIniciante aventureiro = new AventureiroIniciante();
        aventureiro.setDanoRecebido(350);
        aventureiro.setDefesa(100);
        aventureiro.setNome("Fulano");
        assertEquals("Aventureiro{nome='Fulano', saúde=Debilitado}", aventureiro.getInfo());
    }
}
