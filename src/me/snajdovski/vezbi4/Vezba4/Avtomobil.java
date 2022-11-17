package me.snajdovski.vezbi4.Vezba4;
/*
 4. Да се креира класа Avtomobil со приватни атрибути за марка, модел,
поминати километри, боја. Во класата да се дефинира конструктор кој
динамично ќе доделува вредности на сите атрибути. Исто така, да има метод
кој на влез прима целобројна променлива pomnoziKm, и негова задача да
биде множење на поминатите километри со соодветната променлива која се
добива како влезен аргумент. Методот да ја враќа вредноста. Во главната
класа да се креира една инстанца од класата Avtomobil, да се повика методот
и да се испечатат вредностите на истата
 */
public class Avtomobil {
    private String marka,model, boja;
    private float pominatiKilometri;

    public Avtomobil(String marka, String model, String boja, float pominatiKilometri){
        this.boja = boja;
        this.marka = marka;
        this.model = model;
        this.pominatiKilometri = pominatiKilometri;
    }

    public float pomnoziKm(int multiplajerNekoj){
        return pominatiKilometri * multiplajerNekoj;
    }

    @Override
    public String toString(){
        return "Marka: " + this.marka + " Model: "+ this.model + " Boja "+ this.boja + " pominati Kilometri "+
                this.pominatiKilometri;
    }

    // nema potreba od setteri ko imame dinamicen konstruktor
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getBoja() {
        return boja;
    }

    public float getPominatiKilometri() {
        return pominatiKilometri;
    }
}
