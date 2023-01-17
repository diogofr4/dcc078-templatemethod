import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AventureiroEspecialistaTest{
    @Test
    void deveRetornarSaudavel(){
        AventureiroEspecialista aventureiro = new AventureiroEspecialista();
        aventureiro.setDanoRecebido(200);
        aventureiro.setDefesa(100);
        assertEquals("Saudável", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarDebilitado(){
        AventureiroEspecialista aventureiro = new AventureiroEspecialista();
        aventureiro.setDanoRecebido(700);
        aventureiro.setDefesa(100);
        assertEquals("Debilitado", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarMorto(){
        AventureiroEspecialista aventureiro = new AventureiroEspecialista();
        aventureiro.setDanoRecebido(800);
        aventureiro.setDefesa(100);
        assertEquals("Morto", aventureiro.verificarSaude());
    }

    @Test
    void deveRetornarInformacoes(){
        AventureiroEspecialista aventureiro = new AventureiroEspecialista();
        aventureiro.setDanoRecebido(700);
        aventureiro.setDefesa(100);
        aventureiro.setNome("Fulano");
        assertEquals("AventureiroEspecialista{nome='Fulano', saúde=Debilitado}", aventureiro.getInfo());
    }
}
