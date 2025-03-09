import java.util.Scanner;
public class ATM
{
public static void main(String arg[])

{
int balance=100000,deposit,withdraw;
Scanner on=new Scanner(System.in);
while(true)
{
System.out.println("AUTOMATIC TELLER MACHINE");
System.out.println("CHOOSE 1 FOR WITHDRAW");
System.out.println("CHOOSE 2 FOR DEPOSIT");
System.out.println("CHOOSE 3 FOR CHECK BALANCE");
System.out.println("CHOOSE 4 FOR EXIT");
System.out.println("CHOOSE THE OPERATION YOU WANT TO PERFORM");
int choice = on.nextInt();
switch(choice)
{
case 1:
System.out.println("ENTER MONEY TO WITHDRAW  :");
withdraw =on.nextInt();
if(withdraw<=balance)
{
balance=balance-withdraw;
System.out.println("PLEASSE COLLECT YOUR MONEY");
}
else
{
System.out.println("INSSUFICIENT BALANCE");
}
System.out.println(" ");

break;
case 2:
System.out.println("ENTER THE DEPOSIT AMOUNT ");
deposit=on.nextInt();
balance=balance+deposit;
System.out.println("YOUR MONEY IS SUCESSFULLY DEPOSITED ");
System.out.println(" ");
break;
case 3:
System.out.println("BALANCE "+balance);
System.out.println(" ");
break;
case 4:
System.exit(0);
}
}
}
}





