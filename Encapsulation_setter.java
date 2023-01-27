public class Encapsulation_setter {
    public static void main(String args[]) {
        Amazon customer = new Amazon();
        float payableAmount=customer.Transaction(1000);
        System.out.println("Total payable" + payableAmount);
    }
}
class Amazon{
    float Transaction(float amt){
        GPay gpayObj=new GPay();
        gpayObj.setTxnCharge(0.07f);
        float totalAmount=amt+ (amt* gpayObj.getTxnCharge());
        return totalAmount;
    }
}
class GPay{
   private   float txnCharge=0.05f;
   public void setTxnCharge(float newCharge){
    txnCharge=newCharge;
   }
   public float getTxnCharge(){
    return txnCharge;
   }

}
