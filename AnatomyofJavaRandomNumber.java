import java.util.*;
public class AnatomyofJavaRandomNumber {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
   Random rnd=new Random();
    int computerChoice=rnd.nextInt(20);
    System.out.println( "Computer generated Number is "+ computerChoice);
    for(int i=1;i<=6;i++){
        System.out.println("Gues a number between 0 and 20");
        int userChoice=sc.nextInt();
        if(userChoice>computerChoice){
            System.out.println("Your Guess is too high");
        }
        else if(userChoice<computerChoice){
            System.out.println("Your guess is Too low");
        }
        else{
            System.out.println("Gotcha ! you guessed it right");
            break;
        }
    }
}
}