package com.lbartem.calc;

public class Operation {
    private int n1;
    private int n2;

    private int sum;

    private int subtraction;

    private int multiplication;
    private Float division;

    private int result;

    private String content;

    private String op = "";

//    TODO
//    refactor
//    add logic
//    operation becomes visible after submit button
//    first iteration
//    operation is done on second iteration

//    TODO
//    change getters and setters for operation to become visible

//    iteration zero
//    page loaded from start
//    ->> variables are at zero point value
//
//    iteration one
//    page is reloaded
//    operation is chosen

//    iteration two
//    operation is done

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public int getMultiplication() {
        return n1*n2;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }

    public Float getDivision() {
        return Float.valueOf((float) n1 /n2);
    }

    public void setDivision(Float division) {
        this.division = division;
    }

    public int getSubtraction() {
        return n1-n2;
    }

    public void setSubtraction(int subtraction) {
        this.subtraction = subtraction;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void sum() {
        this.op = "+";
    }

    public int getSum() {
        return n1+n2;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
