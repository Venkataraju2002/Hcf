import java.util.*;
public class Hcf {
public static void main(String[] args) {
Scanner s =new Scanner(System.in);
System.out.println("enter two number");
int a= s.nextInt();
int b = s.nextInt();
 int hcf =1;
 for(int i=1;i<=a;i++)
 {
	 if(a%i ==0&& b%i == 0)
		 hcf =i;
	 
 }
 System.out.println("Hcf = "+hcf);
}}
