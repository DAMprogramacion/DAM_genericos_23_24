package teoria.clasesGenericas;

public class Generica3 <T, U> {
    private T atributo1;
    private U atributo2;

    public Generica3(T atributo1, U atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public T getAtributo1() {
        return atributo1;
    }

    public U getAtributo2() {
        return atributo2;
    }

    public void setAtributo1(T atributo1) {
        this.atributo1 = atributo1;
    }

    public void setAtributo2(U atributo2) {
        this.atributo2 = atributo2;
    }

    @Override
    public String toString() {
        return "Generica3{" +
                "atributo1=" + atributo1 +
                ", atributo2=" + atributo2 +
                '}';
    }
}
