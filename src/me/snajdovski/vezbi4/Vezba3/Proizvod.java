package me.snajdovski.vezbi4.Vezba3;
/*
3. Да се креира класа Proizvod со приватни атрибути за име на производот,
цена, производител, тежина. Во класата да се дефинира конструктор кој ќе
доделува статични вредности на сите атрибути од класата, и гетери и сетери.
Во главната класа да се креира една инстанца од класата Proizvod и да се
испечатат вредностите на истата.
*/
public class Proizvod {
    private String imeNaProizvod, proizvoditel;
    private int cena;
    private float tezinaVoGrama;

    //staticki konstruktor
    public Proizvod(){
        this.imeNaProizvod = "Smoki";
        this.proizvoditel = "Stobi Flips";
        this.cena = 10;
        this.tezinaVoGrama = 100.0F;
    }

    public String getImeNaProizvod() {
        return imeNaProizvod;
    }
    public String getProizvoditel(){
        return this.proizvoditel;
    }

    public int getCena() {
        return cena;
    }

    public float getTezinaVoGrama() {
        return tezinaVoGrama;
    }

    public void setImeNaProizvod(String proizvoditel){
        this.proizvoditel = proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setTezinaVoGrama(float tezinaVoGrama) {
        this.tezinaVoGrama = tezinaVoGrama;
    }

    @Override
    public String toString() {
        return
                "imeNaProizvod = " + imeNaProizvod  +
                ", proizvoditel = " + proizvoditel +
                ", cena = " + cena + " denari " +
                ", tezinaVoGrama = " + tezinaVoGrama + " grama.";
    }
}
