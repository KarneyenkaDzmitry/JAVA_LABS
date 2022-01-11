package com.example.lab_7_2;

public abstract class Employee {
    private NameIdentity identity;
    private String position;
    private Double rate;//oklad

    public Employee(NameIdentity identity, String position, Double rate) throws OkladException {
        this.identity = identity;
        this.position = position;
        try{
            if (rate<=0.0) throw new OkladException();
            this.rate = rate;
        } catch (OkladException exception) {
            System.out.println("A new " + this.getClass() + " is not able to be created - the propagated rate is negative: " + rate);
            throw exception;
        }
    }

    public NameIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(NameIdentity identity) {
        this.identity = identity;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate){
        try{
            if (rate<=0.0) throw new OkladException();
            this.rate = rate;
        } catch (OkladException exception) {
            exception.printMessage();
        }

    }

    public abstract Double calculateSalary();
}
