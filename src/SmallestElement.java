import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {

        Scanner Userinput = new Scanner(System.in);

        System.out.println("Enter ten Number: ");
        double EnterTenNum = Userinput.nextDouble();

        System.out.println("The minimum number is: " + EnterTenNum);

    }
    
    public static double min(double[] EnterTenNUm) {

        double minValue = EnterTenNUm[0];
        for(double i=1;i<EnterTenNUm.length;i++){
            
        }
        return minValue;
    }
}

