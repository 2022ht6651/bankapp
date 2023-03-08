package creditcard;

public class OnboardCreditCard {

    public static void collectApplicantDetails(Integer age) {
        System.out.println("Applicant age is " + age);
    }

    public static void signupCreditCard(String name) {
        System.out.println("Welcome " + name +" to credit card division processing!");
    }

    public static void provisionCard(String[] args) throws Exception {
        signupCreditCard("Vijay Kumar M");
        collectApplicantDetails(32);
        CreditCheck.doCreditCheck("Vijay Kumar M");
        CreditCheck.findCreditScore(30);
    }
}

