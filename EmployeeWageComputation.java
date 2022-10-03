package com.assignment9employeewage;
public class EmployeeWageComputation {

    public int workingHour;
    public int isPresent;
    public int totalworkingDays = 0;
    public int totalSalary = 0;
    int dailyWage;
    public int totalWorkingHour = 0;
    String company;
     int hoursInMonth;
     int numWorkingDays;
    int wagePerHour;


    public EmployeeWageComputation() {
        System.out.println(" Employee Wage Computation Program UC9  !!!");
        System.out.println("  Compute Employee Wage for multiple companies");

    }
    public EmployeeWageComputation(String company, int hoursInMonth, int numWorkingDays, int wagePerHour){

        this.company = company;
        this.hoursInMonth = hoursInMonth;
        this.numWorkingDays =numWorkingDays;
        this.wagePerHour =wagePerHour;

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
                //System.out.println("Employee is absent");
                workingHour = 0;
                break;
            case 1:
                //System.out.println("Employee is Present");
                workingHour = 8;
                break;
            default:
               // System.out.println("Employee is working  Part-Time");
                workingHour = 8;
                break;
        }
    }

    // Calculate Employee Wage
    public int calculateMonthlyWage() {

        while (totalWorkingHour <= hoursInMonth && totalworkingDays <= numWorkingDays) {
            totalworkingDays++;
            checkEmployee();

            int dailyWage = wagePerHour * workingHour;
            totalWorkingHour = totalWorkingHour + workingHour;
            totalSalary = dailyWage + totalSalary;

        }
        System.out.println("Days = " + totalworkingDays + " EmpHours = " + totalWorkingHour);
        System.out.println("Total EmpWage for Company :" + company + " is :" + totalSalary);
        return totalSalary;
    }

    public static void main(String[] args) {
        System.out.println("welcome to the Employee Wage Computation!!!");
        EmployeeWageComputation empobj = new EmployeeWageComputation();
        EmployeeWageComputation adidas = new EmployeeWageComputation("Adidas", 100, 22, 50);

        EmployeeWageComputation fila = new EmployeeWageComputation("Fila", 100, 20, 100);
        adidas.calculateMonthlyWage();
        System.out.println(adidas);
        fila.calculateMonthlyWage();
        System.out.println(fila);
    }

}



