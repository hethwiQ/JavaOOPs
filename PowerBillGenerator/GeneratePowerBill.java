package PowerBillingSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneratePowerBill {
    public static void main(String args[]) throws IOException {
        GetRatesFactor PlanFactory = new GetRatesFactor();
        System.out.print("Enter the type of Usage (C for Commercial, D for Domestic, I for Institutional): \n👉 ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.print("Enter number of units for bill will be calculated \n👉 ");
        int units = Integer.parseInt(br.readLine());
        Rates P = PlanFactory.getRates(planName);
        System.out.print("Bill amount for " + units + " units is 👉 ");
        P.getRate();
        P.calculateBill(units);
    }
}
