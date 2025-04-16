package NivelIntermediario3;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1);


    String nomeBiju;
    String jinchuriki;
    int numeroDeCaudas;

    Biju() {
    }

    Biju(String nomeBiju, String jinchuriki, int numeroDeCaudas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaudas = numeroDeCaudas;
    }
}
