import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Hw3 {
    public static void main(String[] args) {
        int left = 100;
        int ticket;
        int buyer = 0;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the amount of tickets you want. ");
            ticket = scan.nextInt();
            if(ticket <= 4)
            {
                if(ticket > left)
                {
                    System.out.println("There are only " + left + " tickets left." + "\n");
                }
                else
                {
                    left = left - ticket;
                    System.out.println("The amount of tickets left: " + left + "\n");
                }
            }
            else
            {
                System.out.println("You can only buy a maximum of 4 tickets." + "\n");
            }
            
        } while(left > 0);
    }
    
}
