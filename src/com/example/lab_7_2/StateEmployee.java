package com.example.lab_7_2;

public class StateEmployee extends Employee {

    public StateEmployee(NameIdentity identity, String position, Double rate) throws OkladException {
        super(identity, position, rate);
    }

    public Double calculateBonus() {
        try {
            double bonus = 0.0;
            if (bonus<=0.0) throw new PremiyaException();
            return 0.0;
        } catch (Exception exception) {
            System.out.println("The " + exception.getClass() + " Exception is thrown!");
            System.out.println(exception.getStackTrace());
            return 0.0;
        }
    }

    @Override
    public Double calculateSalary() {
        try {
            double premiya = 0.0;
            if (premiya<=0.0) throw new SalaryException();
            return 0.0;
        } catch (Exception exception) {
            System.out.println("The " + exception.getClass() + " Exception is thrown!");
            System.out.println(exception.getStackTrace());
            return 0.0;
        }
    }
}
