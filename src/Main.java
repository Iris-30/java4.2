public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double loanRate = 9.99 ;          //  процентная ставка по кредиту
        int sumLoan = 1_000_000;          // сумма кредита
        int loanTerm = 12;                // срок кредита, месяц

        double cps = (int) service.calculate (loanRate, sumLoan, loanTerm ); // тут была высота и длина

        System.out.println("Аннуитетный платёж " + Math.round(cps));
    }
}