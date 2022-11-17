package me.snajdovski.vezbi4.Vezba2;
/*
2. Да се креира класа Restoran со приватни атрибути за име на ресторанот,
локација, телефон, број на седишта. Во класата да се дефинираат гетери и
сетери за сите атрибути. Во главната класа да се креира една инстанца од
класата Restoran, да и се доделат врености и да се испечатат со коментар по
избор.
 */
public class Restoran {
    private String imeNaRestoran,lokacija;
    private String telefon;
    private int brNaSedista;

    public String getImeNaRestoran() {
        return imeNaRestoran;
    }

    public void setImeNaRestoran(String imeNaRestoran) {
        this.imeNaRestoran = imeNaRestoran;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getBrNaSedista() {
        return brNaSedista;
    }

    public void setBrNaSedista(int brNaSedista) {
        this.brNaSedista = brNaSedista;
    }

    //toString za delot "po izbor"

    @Override
    public String toString() {
        return "Restoran Object: " + getClass().getSimpleName() +
                " Imeto na restoranot e " + imeNaRestoran +
                ", lokacijata e" + lokacija  +
                ", telefon " + telefon  +
                ", ima kapacitet od " + brNaSedista +
                " sedista.";
    }
}
