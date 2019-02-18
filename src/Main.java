/*
 * Author: Atila Silva
 * Email: atila.danvi@outlook.com
 * Project: JavaStarted
 * Class name: Main
 * made at 16/2/2019
 * Copyright (c) 2019.
 */

public class Main {

    /**
     * The Main method. Start app
     */
    public static void main(String[] args) {
        Baskara bsk = new Baskara(1.0,-1.0,-6.0);
        System.out.println(bsk.delta());
        System.out.println(bsk.x1());
        System.out.println(bsk.x2());
        Wrapper.integer(2);
        Wrapper.bool(true);
        Wrapper.string("Hello World ");
        Wrapper.character('H');
        System.out.println(Calc.sqrt(0.3));
        System.out.println(Calc.pow(7.2 , 3));
        System.out.println(Calc.pow(2.0));
        System.out.println(Calc.sum(2.4 , 4.5));
        System.out.println(Calc.sum(2.92 , 4.4));
    }

}
