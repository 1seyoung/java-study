package com.practice.chapter05;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager manager = new SalaryManager();
        System.out.println("Real monthlySalary" + manager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0 ;
        System.out.println("Monthly salary original  :" + monthlySalary);

        double tax = calculateTax(monthlySalary);
        double nationalPension=calculateNationalPension(monthlySalary);
        double healthInsurance=calculateHealthInsurance(monthlySalary);
        double minusTotal=tax+nationalPension+healthInsurance;

        System.out.println("Tax per month:"+tax);
        System.out.println("NationalPension per month:"+nationalPension);
        System.out.println("HealthInsurance per month:"+healthInsurance);

        monthlySalary-=minusTotal;

        return monthlySalary;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        //   double healthInsurance = monthlySalary * (13.5 / 100);
        return monthlySalary * (13.5 / 100);
    }

    public double calculateNationalPension(double monthlySalary) {
        return monthlySalary*(8.1/100);

    }

    public double calculateTax(double monthlySalary) {
        return monthlySalary * (12.5/100);
    }

}
