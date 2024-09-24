
public class Account {

    // Instance variables
    private String name;
    private double balance;

    // Constructor Sätter balansen till 0.
    public Account() {
        this.balance = 0;
    }

    // Constructor Tar emot en balans.
    public Account(double balance) {
        this.balance = balance;
    }

    // Constructor Tar emot ett namn.
    public Account(String name) {
        this.name = name;
    }

    // Constructor Tar emot både namn och balans.
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method Ökar balansen med ett angivet belopp om beloppet är positivt.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("You can't deposit a negative amount. ❌");
        }
    }

    // Method Minskar balansen med ett angivet belopp om beloppet är positivt och inte överstiger den nuvarande balansen.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount or insufficient funds. ❌");
        }
    }

    // Method to read name
    public String getName() {
        return name;
    }

    // Method to write to a name
    public void setName(String name) {
        this.name = name;
    }

    // Method to read balance
    public double getBalance() {
        return balance;
    }

    // Method that returns a string with name and balance
    @Override
    public String toString() {
        return "Name: " + name + ", Balance: " + balance + " \uD83D\uDCB0";
    }

    // Metod för att överföra pengar till ett annat konto
    public void transferAmount(Account toAccount, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + this.name + " to \uD83D\uDC49\uD83C\uDFFC" + toAccount.getName()+ " ✅");
        } else {
            System.out.println("Invalid amount or insufficient funds for transfer. ❌");
        }
    }
}

 /* UML-diagram
 *  https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Account.drawio#R%3Cmxfile%3E%3Cdiagram%20name%3D%22Sida-1%22%20id%3D%22Gopq8fTDK501Q1AiHVr8%22%3E7VzZkto4FP0aqmYeoCxvwCNLOnlIJl1DKpk8Ciywqo3FyGLL148ky6uMoQEDM0OKCuhaaD065%2BpKdMsaLXcfKVz5X4iHgpZpeLuWNW6ZJnCBy9%2BEZR9bbNeKDQuKPZUpM0zwL6SMhrKusYeiQkZGSMDwqmickTBEM1awQUrJtphtToJirSu4QJphMoOBbv2BPebH1p7ZzeyfEF74Sc3A7cdPljDJrHoS%2BdAj25zJ%2BtCyRpQQFn9a7kYoEIOXjEv8vZcDT9OGURSyU76wmb2Y%2FTazv7q978j8NfmEv31qm3EpGxisVYdbphvw8oYr0WS2V%2BPg%2Fr0W7RwuIV3gsGUNjNUuTbYZWXGTLU0M7VgbBnghcs142xDl1qwE%2Fmmh3mU908QwmM3ImndF2XlHplpeWrbwXKuyzaei6QmSknpBvgkVPZsS6iHaVg8GEQnEwNU0%2FD0DFKA5S0dIL%2FKVdnhhEybfQrhER3rYVNVTGMBwhv4HI75aT0WHFeZ%2B%2B51nvdGAl2r2SG7g79eMHPbu1wiJfHNUHg8jed2kTaci3yxUaW4QZZjLxiBmvrGkxKHiwXFc55DwXPNAisAcc3LmK4ct%2BdsY8I9bHzM0WUGx%2FsZbrqZpNXmOV7QvqkO7nElx%2FkdElojRPc%2Binqb6owQYWCq9zeQMdJXNz0uZq4xQSegiLTtTGf5BCc07RMfWREcAYUP4l7ijgFYkwmJJloc42uIlh4WgpzkJ2UQ9MXh65uPA%2Bwz3ZC0aHzE4e0tSQ59Q%2FIvnh8lA88eUKU%2FDdEVpfC5GJCBcqMYhkRVkX5qIwlQ1FAmSe02mA5RMX%2BCukPEzjFjSQBIEcBXhqWwySNE4JIyRpcpUhYAcQK4AhnYJDCk4joHBMRvCgqNhAc95GgUR0gAgXAs5f5S8odKEVcxhafFVr9CIDzcOF59lnrGdWf5UnbeL69bHnodCMcWEQQanKQRXBIdMjo4z5C8%2BhiOj47ScsWA0R4hhkuYvkZ2yEQl5XyCW04k4WLZIAOb9OKhdZcfBkYDBPQ0LSb6rY6FXxwtbzHyPwu2TGG5BDNbdiaH%2FJIaGiKF3MjjuQAxvix%2Ff1r15%2F%2BdX15877AVtQq8NNCxou8cFYn8g4T5W7R5P4wuQg0a6ca0Gx2W08rgcomGiglYOcogDSs6FUcEhbgVuruFoVuJGj24wH0edTufJIBeg4PASfReDVCGhMQaxKhikBIEAy6mNIZDE%2BsBZ87%2FkMxmgbMK%2FCTyM20ADhaWDwqoAQACnKHgV2yJMRPk0zlsCxrG5L4Ibhz6imDU46YlrcGzSew3Nub610FQjeqrGo6lGZXzipqrhPlXjVqrhPLZqdJ%2Bq0YBq1E%2F6vVVDD0Lc7USMq9NQncjUHIrVhqWfonWbrU7v3qKlh0ueotWQaPUeW7QSaD5V66qqVT%2Fr91YtoIfIGJkwPtZPSbiPJFjdEyHRmCQAPfxFEVvT8CkJV49%2BPXj4CzzjX43Evx47AAb0ixZ328vkTnL53ITRHNHBUkhG3XWbI3udf%2BvlM3mQCePei2tNcCmISNWWGeL%2FtaT%2BzXhoRLPSG3z%2F8et78SmwgcM5kQr8eHe2LvIlTMPsOEVvwtE3mKbh6FzSb%2BwsTSeT%2BL5eaVBR6A3EvWuemgZE%2BHdDblIOIHDj5IscScntudGkZB16yFMP%2BFjR%2FV8i0TGMXmL4KQ2m4ySG8S6ff7zPp145w%2FPeC46KjTvMRImgYwCVjMuzHJXMShOJfS5RLktgYhDiJVSalDkQyNOulGs3MyKyprMEhjUXs7nzvEB1EmRWA6lKcigKeGM3xbZV4UQV9yrUNQOl7RYdXGCXoBb3SX0rQ5tWkGuXPGWrVFDcaa0gCdu0jxcgWT8YahjJCnZGAXNHIJegH5SRfwT4ck%2Bn2ggO4FT38c5Dbt3xSR65hxF%2BE%2BRqR0zdM5FrG6WCes5tkasfSKSC3zh4OWfmSbPNDVb33bSZ4ZqzulnEttM9h9TLgE9%2FZ3Ndlq6Lup6L9eTynVA40zq8WbgY%2F3YBtua5%2BLf6RfzzlXQS%2FrOCkoxkPo9QM2tEP8A5EPUou39TFTAa5tYOWcmYhAcjX64IgZ%2FZmm7S5VG9WPILBdSvkdTLKayFd5C8WERygzyUDnlppy42bJP8ioizwtnbQjY9yd4yrRf5T5We2D00h2vpSje0ri7yfg5twC91dZwizm1w7oLpHimoacHQj4VOUQoZs62QD6UXaVg3lz7FjXfyEAdHIH5Flk7o74FcktTnTXzgchT4ZISVf9FR3gA2jDDrhMhi0wirIF3jDNJtBpF1V7AfGZBlHJ0KSNO9MyCrgp4PAMhT93vSGewXHWMXWOd4xlcE7OMxKLC7RcD2zgVsYwzKk9nP%2B%2BPs2R9JsD78Aw%3D%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E
 * */