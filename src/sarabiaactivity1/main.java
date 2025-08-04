package appsecb;

import java.util.Scanner;
import banking.bankingClass;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
       
                bankingClass bc = new bankingClass();
                int attempts = 3;
                boolean loggedIn = false;
                
                while (attempts != 0 ) {
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        attempts--;
                        System.out.println("INVALID ACCOUNT AND PIN! ATTEMPT LEFT "+attempts);
                    }
                }
                if (attempts==0);
                    System.out.println("try again");       
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
                }
        }
            
    }
    
}
