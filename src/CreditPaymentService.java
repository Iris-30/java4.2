public class CreditPaymentService {

    public double calculate(double loanRate, int sumLoan, int loanTerm) {
        double interestRate = loanRate / 12 / 100;         //месячная процентная стака
        double calculation = Math.pow(1 + interestRate, loanTerm);      //промежуточный расчет возведения в степень

        double cps = sumLoan * ((interestRate * calculation) / (calculation - 1));
        return cps;
    }
}
