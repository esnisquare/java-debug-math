package com.math.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        int difference = a - b;
        int checked = difference;
        return checked;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return a / b;
    }

    public double square(int a) {
        return a*a;
    }
}
