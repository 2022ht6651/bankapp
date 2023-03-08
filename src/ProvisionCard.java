import creditcard.OnboardCreditCard;
import debitcard.OnboardDebitCard;

public class ProvisionCard {
    public static void main(String[] args) throws Exception {
        OnboardCreditCard.provisionCard(null);
        System.out.println("---------------");
        OnboardDebitCard.provisionCard(null);
    }
}
