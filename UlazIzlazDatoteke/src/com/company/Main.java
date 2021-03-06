package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String imeDatoteke = "tekst.txt";
        List<Radnik> radnici =ucitajRadnike(imeDatoteke);
        for(Radnik radnik : radnici){
            System.out.println(radnik);
        }
        // write your code here

    }
        public static List<Radnik> ucitajRadnike(String imeDatoteke){
            List<Radnik> radnici = new ArrayList<Radnik>();
            try {
                FileInputStream fis = new FileInputStream(imeDatoteke);
                Scanner scanner = new Scanner(fis);
                // ucitavanje radnika datoteke jedan po jedan
                while (scanner.hasNext()) {
                    String ime = scanner.nextLine().trim();
                    long jmbg = scanner.nextLong();
                    int staz = scanner.nextInt();
                    double plata = scanner.nextDouble();
                    scanner.nextLine();
                    Radnik radnik = new Radnik(ime, jmbg,staz,plata);
                    radnici.add(radnik);


                }
                    // na kraju oslobadjam resure
                    scanner.close();
                    fis.close();



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return radnici;
        }


    }

