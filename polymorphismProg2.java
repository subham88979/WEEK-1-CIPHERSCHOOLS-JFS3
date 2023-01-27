

abstract class Doctor{
    abstract void treatPatient();

}
class Physician extends Doctor{
    void treatPatient(){
        System.out.println("Hi ! I am a physician and I treat with medicines!");
    }
}
class Surgeon extends Doctor{
    void treatPatient(){
        System.out.println("Hi I am the surgeon!");
    }
}
class Dentist extends Doctor{
    void treatPatient(){
        System.out.println("Hi I am the dentist I play with your teeth!");
    }

}

public class polymorphismProg2 {
    public static void main(String args[]){
        System.out.println("Hi! I am Aditya ! How may I help You ?");
    System.out.println("Who you are looking for ?");
    System.out.println("Enter your choice!");
    int choice =new java.util.Scanner(System.in).nextInt();
    Doctor doc=null;
  switch(choice){
    case 1:
    doc =new Physician();
    break;
    case 2:
    doc=new Surgeon();
    break;
    case 3:
    doc =new Dentist();
    break;
    default:
    System.out.println("invalid choice !");
    break;
  }
  if(choice <0 || choice>3){
  System.exit(0);
  }
  else{
    doc.treatPatient();
  }
}

}