public class AventureiroMestre extends Aventureiro{
    @Override
    public String verificarSaude() {
        int vidaMaxima = 1000;
        if(vidaMaxima <= this.calcularDanoRecebidoFinal())
            return "Morto";
        if(1-(this.calcularDanoRecebidoFinal()/vidaMaxima) < 0.1)
            return "Debilitado";
        else
            return "Saudável";
    }

    @Override
    public String getTipo() {
        return "AventureiroMestre";
    }
}
