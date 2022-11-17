package me.snajdovski.vezbi4.Vezba1;
/*
1. Да се креира класа Covek со три приватни атрибути за име, презиме и
матичен број. Во класата да се дефинира стандарден (default) конструктор, и
гетери и сетери за атрибутите. Во главната класа да се креира една инстанца
од класата Covek, да и се доделат вредности, и истите да се испечатат.
 */
public class Covek {
    private String ime,prezime;
    private String maticenBroj;
    //"default" конструктор вака генерира компјалерот ig
    public Covek(){

    }
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMaticenBroj() {
        return maticenBroj;
    }

    public void setMaticenBroj(String maticenBroj) {
        this.maticenBroj = maticenBroj;
    }
}
