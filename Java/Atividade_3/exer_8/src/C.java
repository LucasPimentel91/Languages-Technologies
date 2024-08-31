public class C {
    public static final C a = new C("A");
    public static final C b = new C("B");
    public static final C c = new C("C");

    private final String descricao;

    private C( String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
