import java.util.Scanner;
// for simple GUI
// import javax.swing.JOptionPane;

class app {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        
        // If Statements

        String day = "Pizza";

        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Monday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
        
            default:
                System.out.println(day + " is not a day!!");
                break;
        }

        
        scanner.close();

        



        

        

    }
}