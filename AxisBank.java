package week3.day1.assignment3;

public class AxisBank extends BankInfo{
public void Deposit()
   {
      System.out.println("Deposit Account in Axis Bank");
   }	
public static void main(String[] args){
       AxisBank obj = new AxisBank();
//Calling the method with child class instance
       obj.Deposit();
       obj.Fixed();
       obj.Saving();
       
 }
}


