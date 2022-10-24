 //Source Code
//Package file:-
package emailapp;
import java.util.Scanner;
public class Email {
private String firstName;
private String lastName;
private String password;
private String department;
private String alternateEmail="";
private int defaultpasswordLength=10;
private String email;
private String companySuffix="company.com";
private int mailboxCapacity;
//Constructor to receive the first name and last name
public Email()
{
System.out.println("\n\ttEnter the Employee Details\n");
Scanner in = new Scanner(System.in);
{
System.out.println("\nFirst name:");
this.firstName=in.nextLine();
System.out.println("\nLast name:");
this.lastName=in.nextLine();
//call a method asking for the department -return the department
this.department=setDepartment();
//call a method that returns a Random Password
this.password=randomPassword(defaultpasswordLength);
//combine elements to generate email
email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+""+companySuffix;
//Set Mailbox Capacity for Employee
System.out.println("\nEnter the mail box Capacity:");
this.mailboxCapacity=in.nextInt();
}
}
//Ask for the department name own department
private String setDepartment()
{
System.out.println("\n\ntEMPLOYEENAME:"+firstName+""+lastName+"\n\nDEPARTMENT CODES: \n1.Tester \n2.Developer \n3.Analyst \n4.None");
System.out.println("\n\nEnter the department codes:");
Scanner in = new Scanner(System.in);
int depChoice=in.nextInt();
if(depChoice==1)
{
return "tester";
}
else if(depChoice==2)
{
return "developer";
}
else if(depChoice==3)
{
return "analyst";
}
else
{
return "None";
}
}
//Generate the random password
private String randomPassword(int length)
{
String 
passwordSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
char[] password=new char[length];
for(int i=0;i<length;i++)
{
int rand=(int)(Math.random() * passwordSet.length());
password[i]=passwordSet.charAt(rand);
}
return new String (password);
}
//Set Alternate Email
public void setAlternateEmail()
{
System.out.println("\n\nEnter the Alternate Email ");
Scanner in = new Scanner(System.in);
this.alternateEmail=in.nextLine();
}
//change the password
public void changePassword()
{
System.out.println("\n\nEnter the new Password");
Scanner in = new Scanner(System.in);
this.password=in.nextLine();
}
public int getMailboxCapacity()
{
return mailboxCapacity;
}
public String getAlternateEmail()
{
return alternateEmail;
}
public String getPassword()
{
return password;
}
public String showInfo1()
{
return "EMPLOYEE NAME:" +firstName+" "+lastName+
"\nCOMPANY EMAIL:"+email+"\n"+
"\nPassword:"+password+"\n"+
"\nMAILBOX CAPACITY:"+mailboxCapacity+"mb";
}
public String showInfo2()
{
return "EMPLOYEE NAME:" +firstName+" "+lastName+
"\nCOMPANY EMAIL:"+email+"\n"+
"\nPassword:"+password+"\n"+
"\nMAILBOX CAPACITY:"+mailboxCapacity+"mb"+
"\nAlternate Email:"+alternateEmail;
}
public String showInfo3()
{
return "EMPLOYEE NAME:" +firstName+" "+lastName+
"\nCOMPANY EMAIL:"+email+"\n"+
"\nChanged Password:"+password+"\n"+
"\nMAILBOX CAPACITY:"+mailboxCapacity+"mb"+
"\nAlternate Email:"+alternateEmail;
}
}


