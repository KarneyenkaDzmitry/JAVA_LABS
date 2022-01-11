package com.example.lab_7_2;

public class Contractor extends Employee {

    public Contractor(NameIdentity identity, String position, Double rate) throws OkladException {
        super(identity, position, rate);
    }

    @Override
    public Double calculateSalary(){
        try {
            return 0.0;
        } catch (Exception exception) {
            System.out.println("The " + exception.getClass() + " Exception is thrown!");
            System.out.println(exception.getStackTrace());
            return 0.0;
        }
    }
}
