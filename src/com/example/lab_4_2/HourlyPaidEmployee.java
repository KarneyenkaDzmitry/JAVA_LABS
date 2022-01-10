package com.example.lab_4_2;

public class HourlyPaidEmployee extends Employee {
    private double hourlyRate = 1.0;
    private int workedHoursInDay = 8;
    private double averageAmountWorkingDaysInMonth = 20.8;

    @Override
    public Double calculateSalary() {
        return averageAmountWorkingDaysInMonth * workedHoursInDay * hourlyRate;
    }

    public double getAverageAmountWorkingDaysInMonth() {
        return averageAmountWorkingDaysInMonth;
    }

    public void setAverageAmountWorkingDaysInMonth(double averageAmountWorkingDaysInMonth) {
        this.averageAmountWorkingDaysInMonth = averageAmountWorkingDaysInMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHoursInDay() {
        return workedHoursInDay;
    }

    public void setWorkedHoursInDay(int workedHoursInDay) {
        this.workedHoursInDay = workedHoursInDay;
    }
}
