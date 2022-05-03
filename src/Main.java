public class Main {
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HR = 20;

        int empHrs = 0;
        int empWage = 0;
        double check = Math.floor(Math.random() * 10) % 3;

        System.out.println("---------------------------------------------");
        System.out.println("Welcome to Employee Wage Computation Problem.");
        System.out.println("---------------------------------------------");

        switch((int)check) {
            case 1:
                System.out.println("Employee is Present.");
                empHrs = 8;
                break;

            case 2:
                System.out.println("Employee is Present Part-time.");
                empHrs = 4;
                break;

            default:
                System.out.println("Employee is Absent.");
                empHrs = 0;
                break;
        }
        empWage = empHrs * WAGE_PER_HR;
        System.out.println("Employee Wage: " + empWage);
    }
}
