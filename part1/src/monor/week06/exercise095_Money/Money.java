package monor.week06.exercise095_Money;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        } else if (cents < 0) {
            euros -= 1;
            cents += 100;
        } else if (euros < 0) {
            euros = 0;
            cents = 0;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money money) {
        return new Money(this.euros + money.euros, this.cents + money.cents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else return this.euros == compared.euros && this.cents < compared.cents;
    }

    public Money minus(Money decremented) {
        return new Money(this.euros - decremented.euros, this.cents - decremented.cents);
    }
}