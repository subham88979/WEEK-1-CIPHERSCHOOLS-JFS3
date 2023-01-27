interface olaCustomer{
    void bookCab();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void maincancelCab();
    void addMoneyToWallet();
    void raiseTicket();
    void signUp();
    void singIn();
}
interface olaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();
}
interface olaOwner{
    void getDriverRecords();
    void getReportByDriver();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomerFeeback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}
public class Abstraction1  implements olaCustomer,olaDriver,olaOwner{
    public static void main(String args[]){
        olaCustomer cust=new Abstraction1();
        olaDriver Driver1=new Abstraction1();
        Driver1.acceptBooking();

    }
       public  void bookCab(){
           
       }
       public  void findARide(){

       }
       public  void rentCab(){

       }
       public  void rateDriver(){

       }
       public void scheduleCab(){

       }
       public  void maincancelCab(){

       }
       public  void addMoneyToWallet(){

       }
       public  void raiseTicket(){

       }
       public  void signUp(){

       }
       public void singIn(){
        
       }
       public void acceptBooking(){

       }
       public void getCustomerLocation(){

       }
       public void setAvailableStatus(){

       }
       public   void getMyCommission(){

       }

       public void raiseMoneyTransferRequest(){

       }
       public void callCustomer(){

       }
       public  void setUpYourVehicle(){

       }
       public  void customerFeedback(){

       }
       public void getDriverRecords(){

       }
       public void getReportByDriver(){

       }
       public void getReportByRegion(){

       }
       public void getTotalRevenue(){

       }
       public void getCustomerFeeback(){

       }
       public void addDriver(){

       }
       public void removeDriver(){

       }
       public void changeDriverStatus(){

       }
    }

  