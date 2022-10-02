package com.assignment9employeewage;

public class EmployeeWageComputation {

    public int isPresent;

    public EmployeeWageComputation() {
        System.out.println(" Employee Wage Computation Program UC1  !!!");
        System.out.println("  Check Employee is Present or Absent");

    }

    public static void main(String[] args) {
        System.out.println("welcome to the Employee Wage Computation!!!");
        EmployeeWageComputation empobj = new EmployeeWageComputation();
        empobj.checkEmployee();


    }

    public int getRandomNumber() {
        int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
        return isPresent;
    }

    public void checkEmployee() {
        isPresent = getRandomNumber();
        System.out.println(isPresent);
        if (isPresent == 0) {
            System.out.println("Employee is absent");

        } else if (isPresent == 1) {
            System.out.println("Employee is Present");
        }
    }
}
