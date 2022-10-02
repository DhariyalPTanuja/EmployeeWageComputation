package com.assignment9employeewage;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class EmployeeWageComputation {
    public int wagePerHour = 20;
    public int workingHour;
    public int isPresent;
    public int totalworkingDays = 0;
    public int totalSalary = 0;
    public int numWorkingDays = 20;
    int dailyWage;
    public int totalWorkingHour = 0;

    //Calculating Wages for a Month Assume 20 Working Day per Month
    public EmployeeWageComputation() {
        System.out.println(" Employee Wage Computation Program UC5  !!!");
        System.out.println("  Calculating Wages for a Month");

    }

    public static void main(String[] args) {
        System.out.println("welcome to the Employee Wage Computation!!!");
        EmployeeWageComputation empobj = new EmployeeWageComputation();
        empobj.calculateMonthlyWage();


    }

    public int getRandomNumber() {
        int isPresent = (int) (Math.floor(Math.random() * 10) % 3);
        return isPresent;
    }

    public void checkEmployee() {
        isPresent = getRandomNumber();

        //System.out.println(isPresent);
        switch (isPresent) {
            case 0:
                System.out.println("Employee is absent");
                workingHour = 0;
                break;
            case 1:
                System.out.println("Employee is Present");
                workingHour = 8;
                break;
            default:
                System.out.println("Employee is working  Part-Time");
                workingHour = 8;
                break;
        }
    }
    // Calculate Employee Wage
    public void calculateMonthlyWage() {
        while (totalworkingDays < numWorkingDays) {
            //checkWorkHour();
            checkEmployee();
            int dailyWage = wagePerHour * workingHour;
            totalSalary = dailyWage + totalSalary;
            totalworkingDays++;
        }
        System.out.println("totalworkingDays = " + totalworkingDays);
        System.out.println("the total wage of employee is = " + totalSalary);

    }
}