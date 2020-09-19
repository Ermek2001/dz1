package com.company;

public class Main {

    public static void main(String[] args) {
        Car car 1 = new Car (5,2019,5, "Ferrari");
        car1.raspechatka();
        car1.voice("wwww", 6);

        Lexus lexus1 = new Lexus(4,7, "Lexus gx470", 2010, new Pricep(600));
        lexus1.raspechatka();
        lexus1.voice ("wwww", 3);

        Lexus lexus2 = new Lexus(4,2 "Honda v3.5", 2009, new Pricep(300));
        lexus2.method(lexus1);
        lexus2.raspechatka();
        lexus2.voice ("wwww", 7);

    }
}
