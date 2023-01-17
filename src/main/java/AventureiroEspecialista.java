public class AventureiroEspecialista extends Aventureiro {
    @Override
    public String verificarSaude() {
        int vidaMaxima = 700;
        if(vidaMaxima <= this.calcularDanoRecebidoFinal())
            return "Morto";
        if(1-(this.calcularDanoRecebidoFinal()/vidaMaxima) < 0.3)
            return "Debilitado";
        else
            return "Saudável";
    }

    @Override
    public String getTipo() {
        return "AventureiroEspecialista";
    }
}
