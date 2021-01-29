import java.util.Scanner;
public class weekDay{
    public static void main(String args[]){
        int day;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a weekday number (0 to 6): ");
        day=sc.nextInt();

        //print weekday name according to give value
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid weekday number");
                break;
        }

    }
}