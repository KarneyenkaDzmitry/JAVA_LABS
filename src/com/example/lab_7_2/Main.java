package com.example.lab_7_2;

public class Main {
    public static void main(String[] args) {
        try{
            new Contractor(new NameIdentity("Name", "Surename", "Patronimic"), "Engineer", -5.0);
        } catch (Exception exception){
            System.out.println(exception);
        }

        try{
            new StateEmployee(new NameIdentity("Name", "Surename", "Patronimic_Z"), "Engineer", -5.0);
        } catch (Exception exception){
            System.out.println(exception);
        }

        try{
            Employee vasia = new StateEmployee(new NameIdentity("Name", "Surename", "Patronimic_Z"), "Engineer", 5.0);
            vasia.calculateSalary();
        } catch (Exception exception){
            System.out.println(exception);
        }

        try{
            StateEmployee vasia = new StateEmployee(new NameIdentity("Name", "Surename", "Patronimic_Z"), "Engineer", 5.0);
            vasia.calculateBonus();
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}
