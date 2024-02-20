package teoria.clasesGenericas;

public class Generico1 {
    private Object atributo;

    public Generico1(java.lang.Object atributo) {
        this.atributo = atributo;
    }

    public Object getAtributo() {
        return atributo;
    }

    public void setAtributo(Object atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Generico1{" +
                "atributo=" + atributo +
                '}';
    }
}
