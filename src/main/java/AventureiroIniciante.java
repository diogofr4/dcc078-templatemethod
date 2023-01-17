public class AventureiroIniciante extends Aventureiro{
    @Override
    public String verificarSaude() {
        int vidaMaxima = 300;
        if(vidaMaxima <= this.calcularDanoRecebidoFinal())
            return "Morto";
        if(1-(this.calcularDanoRecebidoFinal()/vidaMaxima) < 0.7)
            return "Debilitado";
        else
            return "Saudável";
    }
}
