package BankingSys;import java.util.Scanner;

public class BankDetail2
{   //pennywise.io
    static char ch;

    public static void main(String[] args)
    {
        Scanner soc = new Scanner(System.in);
        Current cu=new Current ();
        Saving sav=new Saving ();
        System.out.println("🏦 WELCOME TO MAZE BANK 🏦");
        System.out.println("👉 Choose Account type:");
        System.out.println("(Press 'C' for Current & 'S' for Savings Account)\n👇");
        ch= soc.next().charAt(0);
        if(ch=='c'||ch=='C')
        {
            cu.get_info();
            cu.check_Bal();
            while(true)
            {
                System.out.println("1.Display ✍️\n2.Deposit 🫳\n3.Withdraw 🫴\n4.Exit 👋");
                System.out.println("Enter Your Choice:\n👇");
                int cho= soc.nextInt();
                switch (cho) {
                    case 1 -> cu.show();
                    case 2 -> cu.deposit();
                    case 3 -> cu.withdraw_Bal();
                    case 4 -> System.exit(0);
                    default -> System.out.println("Wrong Choice!⚠️");
                }
            }
        }
        else if(ch=='s'||ch=='S')
        {
            sav.get_info();
            while(true)
            {
                System.out.println("1.Display ✍️\n2.Deposit 🫳\n3.Withdraw 🫴\n4.Interest 💵\n5.Exit 👋");
                System.out.println("Enter Your Choice:\n👇");
                int cho= soc.nextInt();
                switch (cho) {
                    case 1 -> sav.show();
                    case 2 -> sav.deposit();
                    case 3 -> sav.withdraw_Bal();
                    case 4 -> sav.check_interest();
                    case 5 -> System.exit(0);
                    default -> System.out.println("Exit 👋");
                }//pennywise.io
            }
        }
        else
        {
            System.out.println("Account doesn't exits! ⚠️");
        }
    }
}
