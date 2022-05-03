public class Main {
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HR = 20;

        int empHrs;
        int empWage;
        double check = Math.floor(Math.random() * 10) % 3;

        System.out.println("---------------------------------------------");
        System.out.println("Welcome to Employee Wage Computation Problem.");
        System.out.println("---------------------------------------------");

        if (check == IS_FULL_TIME){
            System.out.println("Employee is Present.");
            empHrs = 8;
        } else if (check == IS_PART_TIME) {
            System.out.println("Employee is Present Part-time.");
            empHrs = 4;
        } else{
            System.out.println("Employee is Absent.");
            empHrs = 0;
        }

        empWage = empHrs * WAGE_PER_HR;
        System.out.println("Employee Wage: " + empWage);
    }
}
