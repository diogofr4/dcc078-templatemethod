import java.util.ArrayList;

public abstract class Aventureiro {
    private String nome;
    private float danoRecebido = 0;
    private float defesa = 0;

    public float getDefesa() {
        return defesa;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDanoRecebido() {
        return danoRecebido;
    }

    public void setDanoRecebido(float danoRecebido) {
        this.danoRecebido = danoRecebido;
    }

    public float calcularDanoRecebidoFinal(){
        if(this.defesa > this.danoRecebido)
            return 0;
        else
            return this.danoRecebido - this.defesa;
    }

    public abstract String verificarSaude();

    public String getTipo(){
        return "Aventureiro";
    }

    public String getInfo() {
        return  getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", saúde=" + this.verificarSaude() +
                '}';
    }
}
