package debitcard;
public class OnboardDebitCard {
    public static void collectApplicantDetails(Integer age) {
        System.out.println("Applicant age is " + age);
    }

    public static void signupCreditCard(String name) {
        System.out.println("Welcome " + name +" to debit card division processing!");
    }

    public static void main(String[] args) throws Exception {
        signupCreditCard("Reddy M");
        collectApplicantDetails(45);
        creditcard.CreditCheck.doCreditCheck("Vijay M");
    }
}

