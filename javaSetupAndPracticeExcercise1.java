import java.util.Scanner;
public class javaSetupAndPracticeExcercise1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number !");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("+ve Number");
        }
        else if(num==0)
        {
            System.out.println("Neutral Number");
        }
        else{
            System.out.println("-ve number");
        }
    }
}