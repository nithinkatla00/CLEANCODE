import java.util.Scanner;
class Interest
{
    public static void main (String args[])
{
    double Principle, Rate, Time, SimpleInterest,CompoundInterest;
    Scanner sc=new Scanner(System. in);
    System.out.println("Enter the Principle:");
    Principle=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    Time=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    Rate=sc.nextDouble();
    SimpleInterest=( Principle* Time * Rate)/100;
    CompoundInterest=Principle* Math.pow(1.0+Rate/100.0,Time) - Principle;
    System.out.println("Simple Interest="+SimpleInterest);
    System.out. println("Compound Interest="+CompoundInterest);
   }
}
