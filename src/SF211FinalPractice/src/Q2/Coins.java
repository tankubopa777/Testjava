package SF211FinalPractice.src.Q2;



import java.util.Objects;

/* Coins Class */
class Coins{
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins(int quarters, int dimes, int nickels, int pennies) {
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }
    public int getQuarters() {
        return quarters;
    }

    public Coins setQuarters(int quarters) {
        this.quarters = quarters;
        return this;
    }

    public int getDimes() {
        return dimes;
    }

    public Coins setDimes(int dimes) {
        this.dimes = dimes;
        return this;
    }

    public int getNickels() {
        return nickels;
    }

    public Coins setNickels(int nickels) {
        this.nickels = nickels;
        return this;
    }

    public int getPennies() {
        return pennies;
    }

    public Coins setPennies(int pennies) {
        this.pennies = pennies;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coins coins = (Coins) o;
        return quarters == coins.quarters && dimes == coins.dimes && nickels == coins.nickels && pennies == coins.pennies;
    }

}

