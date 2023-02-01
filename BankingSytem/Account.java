package BankingSys;
import java.util.Scanner;
class BankDetail
{
    public static int min=500;
    String name;
    int BankDetail_num;
    public float o_Price;
    Scanner sc=new Scanner(System.in);
    public void get_info()
    //pennywise.io
    {
        System.out.println("Enter Name:\n👇");
        name=sc.nextLine();
        System.out.println("Enter Account Number:\n👇");
        BankDetail_num=sc.nextInt();
        System.out.println("Enter opening Amount(Minimum 500):\n👇");
        o_Price=sc.nextFloat();
        if(o_Price <500)
        {
            System.out.println(" 💵 Minimum amount should be > 500 ⚠️");
        }
    }
    public void show()
    {
        System.out.println("Name:\n👇"+name);
        System.out.println("Account_number:\n👇"+BankDetail_num);
        System.out.println("Amount:\n👇"+o_Price);
    }
}
class Current extends BankDetail
{
    float deposit,withdraw,penality;
    public void deposit()
    {
        System.out.println("Enter Amount to deposit 🫳:\n👇") ;
        deposit =sc.nextFloat();
        show();
        o_Price=o_Price+deposit;
        System.out.println("Total amount is 🏦:\n👇"+o_Price) ;
    }
    public void check_Bal()
    {
        if(o_Price<min)
        {
            System.out.println("Minimum amount > 500 ⚠️");
            o_Price=o_Price-150;
            System.out.println("***You Have depleted your balance < Minimum Amount. 150$ penalty***\nYour Balance after penalty:\n👇 "+o_Price);
        }
    }
    public void withdraw_Bal()
    {
        System.out.println("Enter amount to withdraw 🫴:\n👇");
        withdraw=sc.nextFloat();
        show(); 
  /*if(o_Price<500) 
{ 
System.out.println("For withdraw Balance must >500 $");
}*/
        if(withdraw<o_Price)
        {
            o_Price=o_Price-withdraw;
            System.out.println("After Withdraw, Balance:\n👉 "+o_Price);
        }
        else
        {
            System.out.println("***Insufficient Balance can not less than 500 ⚠️***");
        }
        check_Bal();
    }
}
class Saving extends BankDetail
{
    float deposit,withdraw,intr;
    public void deposit()
    {
        System.out.println("Enter Amount to deposit 🫳:\n👇") ;
        deposit =sc.nextFloat();
        show();
        o_Price=o_Price+deposit;
        System.out.println("Total amount is 🏦 :"+o_Price) ;
    }
    public void check_interest()
    {
        intr=(o_Price*2)/100;
        o_Price=o_Price+intr;
        System.out.println("Total amount with interest 💵 is :\n👇"+o_Price) ;
    }
    //pennywise.io
    public void withdraw_Bal()
    {
        System.out.println("Enter amount to withdraw 🫴:\n👇");
        withdraw=sc.nextFloat();
        show();
        if(withdraw<o_Price)
        {
            o_Price=o_Price-withdraw;
            System.out.println("After Withdraw, Balance:\n👉 "+o_Price);
        }
        else
        //pennywise.io
        {
            System.out.println("***Insufficient Balance!⚠️***");
        }
    }
}
