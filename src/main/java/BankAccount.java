/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     * type of account
     */
    public enum BankAccountType {

        /**
         * checkings account.
         */
        CHECKINGS,

        /**
         * savings account.
         */
        SAVINGS,
        /**
         * student account.
         */
        STUDENT,
        /**
         * workplace account.
         */
        WORKPLACE
    }

    /**
     *  @return returns the number of bank accounts
     */
    public static int getNumberAccount() {
        return numberAccount;
    }

    /**
     * number of accounts.
     */
    private static int numberAccount = 0;
    /**
     * account number.
     */
    private int accountNumber;
    /**
     * type of account.
     */
    private BankAccountType accountType;
    /**
     * balance of account.
     */
    private double accountBalance;
    /**
     * owner of account.
     */
    private String ownerName;
    /**
     * interest rate of account.
     */
    private double interestRate;
    /**
     * interest earned in account.
     */
    private double interestEarned;

    /**
     * bank account constructor.
     *
     * @param name unused input arguments
     * @param accountCategory account category
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        accountType = accountCategory;
        ownerName = name;
        BankAccount.numberAccount++;

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /*public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }*/

    /**
     * getter for accountbalance.
     * @return balance of account
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * setter for accountbalance.
     * @param setAccountBalance account balance to set to.
     */
    public void setAccountBalance(double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /*public String getOwnerName() {
        return ownerName;
    }*/

    /**
     * setter for ownerName.
     * @param ownerName ownername to set to.
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /*public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }*/
}
