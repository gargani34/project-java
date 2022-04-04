package com.org;

import PKG.Computer;
import PKG.Printer;
import PKG.Repartitor;

public class Main {

    public static void main(String[] args) {

       /* Car c1 = new Car("audi","A", 200);
        Car c2 = new Car("bmw","B", 100);
        Car c3 = new Car("ford","c", 150);
        c3.getCarInfo();
        System.out.println(c3);

        OwnerInfo W1 = new OwnerInfo("owner1","ownerLastName");
        OwnerInfo W2 = new OwnerInfo("owner2","ownerLastName");
        OwnerInfo W3 = new OwnerInfo("owner3","ownerLastName");
        W1.getFirstName();
        W2.getFirstName();
        System.out.println(W1);
        System.out.println(W2);

        CarInfo B1 = new CarInfo("ghghgh","gh454545");
        CarInfo B2 = new CarInfo("hhhhh","gh45151515");
        System.out.println(B1);
        System.out.println(B2); */

        Printer P1 = new Printer("CANON");
        Printer P2 = new Printer("HP");
        Printer P3 = new Printer("DELL");
        P1.print();
        System.out.println(P1);

        Computer c1 = new Computer("homedesktop");
        c1.getName();
        System.out.println(c1);
    }
}
