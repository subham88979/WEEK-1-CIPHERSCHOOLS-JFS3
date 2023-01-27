import java.util.Scanner;
public class javaSetupAndPracticeExcercise2 {
     public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer's  basic pay");
        double bp=sc.nextDouble();
        double da=0;

       double hra=0;
        if(bp>=5000){
            da=(0.2)*bp;
            hra=(0.1)*bp;

        }
        else{
            hra=((0.2)*bp);
            da=((0.3)*bp);
        }
        System.out.println("The HRA is" + hra +"and the DA is: " + da);
        System.out.println("Total is :" + (bp+hra+da));
     }
}