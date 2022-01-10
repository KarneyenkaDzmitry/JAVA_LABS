package com.example.lab_4_2;

public class EmployeeTest {
    public static void main(String[] args) {
        HourlyPaidEmployee Mike_Wazowski  = new HourlyPaidEmployee();
        FixPaidEmployee James_P_Sullivan = new FixPaidEmployee();
        Mike_Wazowski.setHourlyRate(6.3);
        James_P_Sullivan.setMonthlyPaidSalary(975.5);
        System.out.println("Mike_Wazowski earns the following salary: " + Mike_Wazowski.calculateSalary());
        System.out.println("James_P_Sullivan earns the following salary: " + James_P_Sullivan.calculateSalary());
    }
}
