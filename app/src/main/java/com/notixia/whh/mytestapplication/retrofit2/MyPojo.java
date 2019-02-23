package com.notixia.whh.mytestapplication.retrofit2;

public class MyPojo {
    private Operation operation;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "ClassPojo [operation = " + operation + "]";

    }
}