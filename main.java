import java.util.Scanner;
public class main{
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("You have started a k-pop company! Hello CEO! pls enter your name");
        String ceo = console.nextLine();
        System.out.println("Please enter your company name");
        String name = console.nextLine();
        
        Company c = new Company(ceo, name);
        
        System.out.println("Would you like to make a group?");
        String answer = console.nextLine();
        if (answer.equals("yes")){
            
        }
    }
}
