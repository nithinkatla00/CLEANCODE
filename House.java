import java.util.*;

class Cost{
    public void cost(){
         Scanner sc= new Scanner(System.in);
        System.out.println("select the type of material from the following");
        System.out.println(" 1.Standard Materials ");
        System.out.println(" 2.Above Standard Materials"); 
        System.out.println(" 3.High Standard Materials");  
        System.out.println(" 4.High Standard Materials and Fully Automated Home");
        int n=sc.nextInt();
        
        switch(n){
            case 1: System.out.println("the cost of the house Construction is 1200INR");break;
            case 2: System.out.println("the cost of the house Construction is 1500INR");break;
            case 3: System.out.println("the cost of the house Construction is 1800INR");break;
            case 4: System.out.println("the cost of the house Construction is 2500INR");break;
            default:System.out.println("enter the valid option");break;
                    }
    }
}
public class House{
    public static void main(String args[]){
        Cost hc=new Cost();
        hc.cost();

    }
}
