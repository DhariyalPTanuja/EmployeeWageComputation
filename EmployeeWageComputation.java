package com.assignment9employeewage;

public class EmployeeWageComputation {
    public int isPresent;
    public int wagePerHour = 20;
    public int workingHour;

    public EmployeeWageComputation() {
        System.out.println(" Employee Wage Computation Program UC2  !!!");
        System.out.println("  Calculate Daily Employee Wage");

    }

    public static void main(String[] args) {
        System.out.println("welcome to the Employee Wage Computation!!!");
        EmployeeWageComputation empobj = new EmployeeWageComputation();
        empobj.calculateDailyWage();


    }

    public int getRandomNumber() {
        int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
        return isPresent;
    }

    public void checkEmployee() {
        isPresent= getRandomNumber();
        System.out.println(isPresent);
        if (isPresent == 0) {
            System.out.println("Employee is absent");
            workingHour= 0;

        } else if (isPresent == 1) {
            System.out.println("Employee is Present");
            workingHour= 8;
        }

    }
    //Calculate Daily Employee Wage

    public void calculateDailyWage(  ) {
        checkEmployee();
        int dailyWage = wagePerHour*workingHour;
        System.out.println("the daily wage of employee is = " + dailyWage);
    }

}