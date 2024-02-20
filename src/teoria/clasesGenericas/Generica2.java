package teoria.clasesGenericas;

public class Generica2 <T>{
    private T atributo;

    public Generica2(T atributo) {
        this.atributo = atributo;
    }

    public T getAtributo() {
        return atributo;
    }

    public void setAtributo(T atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Generica2{" +
                "atributo=" + atributo +
                '}';
    }
}
