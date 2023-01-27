public class Encapsulation {
    public static void main(String args[]) {
        Amazon customer = new Amazon();
        float payableAmount=customer.Transaction(1000);
        System.out.println("Total payable" + payableAmount);
    }
}
class Amazon{
    float Transaction(float amt){
        GPay gpayObj=new GPay();
        
        float totalAmount=amt+ (amt* gpayObj.txnCharge);
        return totalAmount;
    }
}
class GPay{
    float txnCharge=0.05f;
    
}