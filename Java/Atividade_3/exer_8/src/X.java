public class X {
    private final C letra;
    private final String descricao;

    public X(C letra, String descricao){
        this.letra = letra;
        this.descricao = descricao;
    }

    public C getLetra(){
        return letra;
    }

    public String getDescricao(){
        return descricao;
    }

    public String toString() {
        return letra.getDescricao() + " " + this.descricao + "/";
    }
}
