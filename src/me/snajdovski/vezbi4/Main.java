package me.snajdovski.vezbi4;

import me.snajdovski.vezbi4.Vezba1.Covek;
import me.snajdovski.vezbi4.Vezba2.Restoran;
import me.snajdovski.vezbi4.Vezba3.Proizvod;

public class Main {
    public static void main(String[] args) {

        Covek covek1 = new Covek();
        covek1.setIme("Stefan");
        covek1.setPrezime("Najdovski");
        covek1.setMaticenBroj("1234567890");

        StringBuilder sbforCovek = new StringBuilder();
        sbforCovek.append(" ime: ").append(covek1.getIme()).append(", prezime: ").append(covek1.getPrezime()).append(" maticen: ").append(covek1.getMaticenBroj()).append(".");


        System.out.println(sbforCovek);

        //Restoran
        Restoran restoranNekoj = new Restoran();
        restoranNekoj.setImeNaRestoran("Sumski feneri? xd");
        restoranNekoj.setLokacija("Bitola");
        restoranNekoj.setTelefon("079-999-999");
        restoranNekoj.setBrNaSedista(500);
        System.out.println(restoranNekoj.toString());


        //Proizvod
        Proizvod smoki = new Proizvod();
        System.out.println(smoki);
    }
}