public class AventureiroExperiente extends Aventureiro{
    @Override
    public String verificarSaude() {
        int vidaMaxima = 500;
        if(vidaMaxima <= this.calcularDanoRecebidoFinal())
            return "Morto";
        if(1-(this.calcularDanoRecebidoFinal()/vidaMaxima) < 0.5)
            return "Debilitado";
        else
            return "Saudável";
    }

    @Override
    public String getTipo() {
        return "AventureiroExperiente";
    }
}
