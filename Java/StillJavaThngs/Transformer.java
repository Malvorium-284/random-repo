package StillJavaThngs;

public class Transformer extends Main2 {

    private static int transnumber;

    void jumpstarterOne() {
        adds();
    }

    void jumpstarterTwo() {
        negatives();
    }

    private void adds() {
        transnumber = super.age + 5;
    }

    private void negatives() {
        transnumber = super.age - 5;
    }

    public int getTotal() {
        return transnumber;
    }

}
