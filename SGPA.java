import java.util.Scanner;
class SGPA{
Scanner sc=new Scanner(System.in);
int marks[]=new int[8];
int credits[]=new int[8];
int USN,sum,totalcredits;
float grade;

void accept()
{
System.out.println("\nEnter Student USN: ");
USN=sc.nextInt();
for(int i=0;i<8;i++)
{
System.out.println("Enter the subject marks: ");
marks[i]=sc.nextInt();
System.out.println("Enter the respective credits: ");
credits[i]=sc.nextInt();
}
}

void calculate()
{
for(int i=0;i<8;i++)
{
sum+=marks[i]*credits[i];
}
for(int i=0;i<8;i++)
{
totalcredits+=credits[i];
}
grade=(float)(sum/(totalcredits*10));
}

void display()
{
System.out.println("USN: "+USN);
System.out.println("SGPA="+grade);
}

public static void main(String args[])
{
SGPA s[]=new SGPA[3];
for(int i=0;i<3;i++)
{
s[i]=new SGPA();
}
for(int i=0;i<3;i++)
{
s[i].accept();
s[i].calculate();
s[i].display();
System.out.println("J S AMOGH KRISHNA 1BM23CS029");
}
}
}