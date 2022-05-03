public class Main {
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HR = 20;
        int TOTAL_WORKING_DAYS = 20;
        int MAX_WORKING_HRS = 100;

        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        System.out.println("Welcome to Employee Wage Computation Problem.");

        while(totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < TOTAL_WORKING_DAYS) {
            totalWorkingDays++;

            System.out.println("Day: " + totalWorkingDays);

            double check = Math.floor(Math.random() * 10) % 3;

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
                totalEmpWage += empWage;

                System.out.println("Employee Wage: " + empWage);
                System.out.println("Hours Worked: " + empHrs);
                System.out.println("-------------------------");
        }
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}
