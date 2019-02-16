/*
 *  Author: Atila Silva
 *  Email: atila.danvi@outlook.com
 *  Project: Janela Única
 *  Class name: Calc
 *  made at 15/2/2019
 *  Copyright (c) 2019.
 */

@SuppressWarnings("SameParameterValue")

class Calc {

    /**
     * Return the result of pow
     * @param n Double
     * @return Double
     */
    static double pow(Double n ,  Integer... p){
        int p1 = p.length > 0 ? p[0] : 2;
        return Math.pow(n,p1);
    }

    /**
     * Return the result of sum between two numbers
     * @param a Double
     * @param b Double
     * @return Double|Integer
     */
    static Number sum(Double a, Double b){
        return (a+b);
    }

}
