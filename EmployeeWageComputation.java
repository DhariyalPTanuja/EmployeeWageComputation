package com.assignment9employeewage;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class EmployeeWageComputation {
    public int wagePerHour = 20;
    public int workingHour;
    public int isPresent;
    public int totalworkingDays = 0;
    public int totalSalary = 0;
    public int numWorkingDays = 20;
    public int hoursInMonth = 100;
    int dailyWage;
    public int totalWorkingHour = 0;

//Calculate Wages till a condition of total working hours or days is reached for a month
//- Assume 100 hours and 20 days

    public EmployeeWageComputation() {
        System.out.println(" Employee Wage Computation Program UC7  !!!");
        System.out.println("  Refactor the Code to write a Class Method to Compute Employee Wage");

    }

    public static void main(String[] args) {
        System.out.println("welcome to the Employee Wage Computation!!!");
        EmployeeWageComputation empobj = new EmployeeWageComputation();
        EmployeeWageFunctions empFunObj = new EmployeeWageFunctions();
        empFunObj.calculateMonthlyWage();


    }


}