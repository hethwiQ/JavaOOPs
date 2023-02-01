package PowerBillingSystem;

public class GetRatesFactor {
    public Rates getRates(String planType) {
        if (planType == null) {
            return null;
        } else if (planType.equalsIgnoreCase("D")) {
            return new DomesticRates();
        } else if (planType.equalsIgnoreCase("C")) {
            return new CommercialRates();
        } else if (planType.equalsIgnoreCase("I")) {
            return new InstitutionalRates();
        } else
            return null;
    }

}
