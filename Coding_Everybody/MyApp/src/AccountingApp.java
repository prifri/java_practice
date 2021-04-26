class Accounting {
    public double valueOfsupply;
    public double vatRate;
    public double expenseRate;

    public Accounting(double in_valueOfsupply, double in_vatRate, double in_expenseRate) {
        valueOfsupply = in_valueOfsupply;
        vatRate = in_vatRate;
        expenseRate = in_expenseRate;
    }

    public double getdiviend1(){
        return getIncome() * 0.5;
    }

    public double getdiviend2(){
        return getIncome() * 0.3;
    }

    public double getdiviend3(){
        return getIncome() * 0.2;
    }

    public double getIncome() {
        return valueOfsupply - getExpense();
    }

    public double getExpense() {
        return valueOfsupply * expenseRate;
    }

    public double getTotal() {
        return valueOfsupply + getVAT();
    }

    public double getVAT() {
        return valueOfsupply*vatRate;
    }

    public void print() {
        System.out.println("Value of supply : " + valueOfsupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expence : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getdiviend1());
        System.out.println("Dividend 2 : " + getdiviend2());
        System.out.println("Dividend 3 : " + getdiviend3());
    }
}

public class AccountingApp {
    public static void main(String[] args){

        Accounting a1 = new Accounting(10000, 0.1, 0.3);
        a1.print();

        Accounting a2 = new Accounting(20000, 0.05, 0.2);
        a2.print();
    }
}
