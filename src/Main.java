public class Main {
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        double check = Math.floor(Math.random() * 10) % 2;

        System.out.println("---------------------------------------------");
        System.out.println("Welcome to Employee Wage Computation Problem.");

        if (check == IS_FULL_TIME){
            System.out.println("Employee is Present.");
        }else{
            System.out.println("Employee is Absent.");
        }
    }
}
