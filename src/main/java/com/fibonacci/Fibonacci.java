package com.fibonacci;

public class Fibonacci {

    public int compute(int numero) {
        if (numero < 0)
            throw new RuntimeException("Number can't be negative");
        else if (numero == 1) {  // caso base
            return 1;
        } else if (numero == 0) {  // caso base
            return 0;
        } else {
            return compute(numero - 1) + compute(numero - 2);
        }
    }
}
