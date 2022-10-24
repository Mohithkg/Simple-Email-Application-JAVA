package emailapp;

import java.util.Scanner;
public class Emailapp 
{
public static void main(String args[])
{ 
System.out.println("\t\t\t\t\t\t...........Welcome...........");
Scanner in = new Scanner(System.in);
int i;
System.out.println("\tENTER 1 TO START UPDATING THE EMPLOYEE DETAILS\n");
i=in.nextInt();
while(i!=0) {
Email em1 = new Email();
System.out.println(em1.showInfo1());
System.out.println("\tEnter 1 to set alternate email / otherwwise 0 \n");
//Scanner in = new Scanner(System.in);
int choice=in.nextInt();
if(choice==1)
{
em1.setAlternateEmail();
System.out.println(em1.showInfo2());
}
else
em1.showInfo1();
System.out.println("\tEnter 1 to change password / otherwise 0\n");
choice=in.nextInt();
 if(choice==1)
{
em1.changePassword();
System.out.println(em1.showInfo3());
}
 else
 em1.showInfo1();
 
 System.out.println("\nTO CONTINUE UPDATING PRESS 1");
System.out.println("\n\nTO STOP UPDATING PRESS 0");
 i=in.nextInt();
 if(i==0)
 System.out.println("......STOPPED.........");
 
}
}
}

