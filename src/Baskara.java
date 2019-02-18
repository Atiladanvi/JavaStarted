/*
 * Author: Atila Silva
 * Email: atila.danvi@outlook.com
 * Project: JavaStarted
 * Class name: Baskara
 * made at 18/2/2019
 * Copyright (c) 2019.
 */

class Baskara {

    private Double a;
    private Double b;
    private Double c;

    /**
     * @param a Double
     * @param b Double
     * @param c Double
     */
    Baskara(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Calc delta
     * @return Double
     */
    double delta(){
        return Math.pow(b , 2)-4*a*c;
    }
    /**
     * Calc x2
     * @return Double
     */
    double x1(){
       return (-(b)+Calc.sqrt(delta()))/2*a;
    }

    /**
     * Calc x1
     * @return Double
     */
    double x2(){
        return (-(b)-Calc.sqrt(delta()))/2*a;
    }
}
