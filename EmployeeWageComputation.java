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
        System.out.println(" Employee Wage Computation Program UC6  !!!");
        System.out.println("  Calculate Wages till a condition of total working hours or days is reached for a month");

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
            while (totalWorkingHour < hoursInMonth && totalworkingDays < numWorkingDays) {
                checkEmployee();
                int dailyWage = wagePerHour * workingHour;
                totalWorkingHour = totalWorkingHour + workingHour;
                totalSalary = dailyWage + totalSalary;
                totalworkingDays++;
            }
            System.out.println("totalworkingDays = " + totalworkingDays);
        System.out.println("totalworkingHours = " + totalWorkingHour);
            System.out.println("the total wage of employee is = " + totalSalary);
        }

}