package com.alex.exp4jplayground;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.ValidationResult;

public class Main {
    public static void main(String[] args) {
        Expression e = new ExpressionBuilder("x + y")
                .variables("x", "y")
                .build()
                .setVariable("x", 2)
                .setVariable("y", 3);

        ValidationResult res = e.validate();
        if (res.isValid()) {
            System.out.println(e.evaluate());
        } else {
            for (String error : res.getErrors()) {
                System.out.println(error);
            }
        }
    }
}