package javalap8;

import java.io.*;
class exph
{
public static void main(String args[])throws IOException
{
char c;
int n;
System.out.println("EXCEPTION HANDLING:");
System.out.println("******************* ");
do
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. from 1 to 3: ");
n=Integer.parseInt(br.readLine());
try
{switch(n)
{
case 1:
{
int d=0,b=0;
b=67/d;
break;
}
case 2:
{
int z[]={1,2,3};
int x,y=20;
x=y/z[9];
break;
}
case 3:
{
break;
}
default:
System.out.println("it is not valid: ");
break;
}
}
catch(ArithmeticException e)
{
System.out.println("Msg from Exception:"+e );
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Msg from Exception:"+e);
}
catch(NegativeArraySizeException e){
System.out.println("Msg from Exception: "+e);
}
System.out.println("do u want to continue r not...? ");
c=(char)br.read();
}
while(c!='n');
}
}