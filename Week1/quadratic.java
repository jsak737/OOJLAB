import java.util.*;
import java.lang.*;
class quadratic
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter values of a,b,c: \n");
double a,b,c;
double r1,r2,d;
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();

if (a==0)
{
System.out.println("invaild!!");
}

d=Math.pow(b,2.0)-4.0*a*c;

if (d>0)
{
r1=((-b+Math.sqrt(d)))/(double)(2.0*a);
r2=((-b-Math.sqrt(d)))/(double)(2.0*a);
System.out.println("roots are r1:"+r1+"  r2:"+r2);
}
else if (d==0)
{
r1=(-b)/(2.0*a);
System.out.println("roots are equal: "+r1);
}
else if (d<0)
{
r1=(-b)/(2.0*a);
r2=Math.sqrt(-d)/(2.0*a);
System.out.println("roots are imaginary");
System.out.println("r1:"+r1+"+i"+r2+"  and   "+r1+"-i"+r2);
}
else
System.out.println("enter valid items");
System.out.println("J S AMOGH KRISHNA 1BM23CS029");
}
}
