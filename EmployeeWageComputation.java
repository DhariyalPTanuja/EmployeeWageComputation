package com.assignment9employeewage;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class EmployeeWageComputation {

    public int workingHour;
    public int isPresent;
    public int totalworkingDays = 0;
    public int totalSalary = 0;
    int dailyWage;
    public int totalWorkingHour = 0;


    public EmployeeWageComputation() {
        System.out.println(" Employee Wage Computation Program UC8  !!!");
        System.out.println("  Compute Employee Wage for multiple companies");

    }

    public static void main(String[] args) {
        System.out.println("welcome to the Employee Wage Computation!!!");
        EmployeeWageComputation empobj = new EmployeeWageComputation();
        empobj.calculateMonthlyWage("Adidas",100,22,50);

        empobj.calculateMonthlyWage("Reebok",100,20,100);
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
    public int calculateMonthlyWage(String company ,int hoursInMonth, int numWorkingDays,int wagePerHour) {

        while (totalWorkingHour <= hoursInMonth && totalworkingDays <= numWorkingDays) {
            totalworkingDays++;
            checkEmployee();

            int dailyWage = wagePerHour * workingHour;
            totalWorkingHour = totalWorkingHour + workingHour;
            totalSalary = dailyWage + totalSalary;

        }
        System.out.println("Days = " + totalworkingDays + " EmpHours = " + totalWorkingHour);
        System.out.println("Total EmpWage for Company :" +company + " is :"  + totalSalary);
        return totalSalary;
    }




}