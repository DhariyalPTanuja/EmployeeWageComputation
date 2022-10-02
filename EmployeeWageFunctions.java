package com.assignment9employeewage;

public class EmployeeWageFunctions extends EmployeeWageComputation  {

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
