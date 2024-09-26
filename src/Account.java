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
 * https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Account.drawio#R%3Cmxfile%3E%3Cdiagram%20name%3D%22Sida-1%22%20id%3D%22Gopq8fTDK501Q1AiHVr8%22%3E7V1rk6K4Gv41Vs35oEW4%2B7G1p3d2a%2Bbs1Lq1u%2FMxQlBqEDyAfZlffxIItyQIokF7VmtqWmJMIHne572CE225e%2F0lhvvtl8hFwURV3NeJ9jhRVWDP5%2FgPaXnLWyxdyRs2se%2FSTlXDyv%2BBaGPR7eC7KGl0TKMoSP19s9GJwhA5aaMNxnH00uzmRUFz1j3cIK5h5cCAb%2F3bd9Nt3mqrVtX%2BCfmbbTEzMOkF72DRmV5JsoVu9FJr0j5OtGUcRWn%2Bbve6RAFZvGJd8u89tXxanliMwrTPF56dJ3U%2BTfXfTfsvpP5YffL%2F%2FDRV81GeYXCgFzxRzQCPt9iTU07f6DqY%2FzuQ81zsYLzxw4n2oOxfy8NpGu1xk541peg1ncLA35BeDj43FOPWagT8bkP%2FZvOsi4YHx4kO%2BFJoO76QNdc3Zltwrz3bto3JqRdIKuYF9VMQXNk6il0UT%2BkHD0kUkIU7cuKnLFCAvLRcIX7Ir%2FEMD7ZKsz8h3KGOK5Q19RoGMHTQv2DF94c1uWCKuQ%2F%2FwV1HWnBmZjeqLfz1TqOGveudRIZ8dcmuh1L8G%2BWc%2BiJfbUypPqM49bHaeMiZ7zGjxAXlwcd8zkWEe3lBpgQ8H5Mzlpx0h%2F88Avz2ZeunaLWHRP4eX7A2xW2k1zIKojibRHMhsj0HtydpHH1HtU9Mx0Zrj3xSaBkyZIyX1UWE%2F5XynOsKg%2BoQcu7otdZEFcgvKNqhNH7DXeinU8Og2oyqcx3o%2BfFLpRyBRfts64rRpI2QKuRNOXils%2FAbqrZOUGE6p8IIrJ4j%2FCVsdqB9lPhEwNkNS178HQYZITsvCtMV%2FYQslLP1A%2FczfIsO5OSTFDrfi6PFNor9H7g%2FLLYNfxyn1G5RTX7PPAVqCmx8c0VGpHPFiPDm12JTANP0Bb42On6GSVqcZRQEcJ%2F46%2By8QQnwRZSm0Y52EoGqhjkOR4tHS1EUuia1diV7NSAFLgQpW2Egpdj9IGWokhBlcIjyPXyMggRxMCLmDreQYZTjqoYE2sQQgpg1Erxffrj5nPV51KuWP%2BjF600u2fqui8Jsc1KYwnUJ5H3kh2m2OsYC%2F8NruFRmxsR4JCxrEAVdHON%2FpHuM9zzE1wL9bD8RRtsLIojrAhIPhKOy2o0OCgYsUb2wUPS7OBbsY%2Bzy4qdbN4Yvd3oRo6KNRNppZwR6sa5NL%2FM7vZxKL12wOCq6N0k23zd%2F%2F3mwvfm3382tZ6RP6Dl0p4BDBuclb1D6X0TMZJGX3I%2BDQA0opYMuhsp5VHWTlNSkT8dFa3stoiTN1Oaa24I9DlMClmqnJNViLR6BEQ1ElHQBG1oIPD4MlG79ZDab3Qmpi5CUvqBol%2FiTCEmEC1WXhAveEuYIKbkT0k9HSJomsJFGJSTzTkhDHLAhFGTcNgXxDtjVMhSY6hY0Qn4kSXE0THhnwPfBgEIvUciAF%2FAShbjnvcQ7A0piQPsyDCjNK%2BTdwjRapXgz7vRyOr14%2BGXbV6YXQ782vQDe5YtReojDO71cml7AhZw8afzCZ9CuZmLVgut4j8LEQ%2FHDjrDPsaxshwn2XmsUsqgwzK%2BeZL%2FhjkCSzlY15P9zh%2Fw386Uhp1UWevzkVR55SF3xQy%2FKyPiGU%2FsedC0oTO2vddNQdClqic2NGIZALdkCLrKlBSJ5LsqrQpg9QaH7QKr78NE6iIilscBN1BQBZn74lG1EpidaQ3d4qeK3f8jBTFHsouFb1oDXo2h4fK33f3yrH31FsY%2BvnlBc1khg8BD6O5j6UUgnRa9%2BSmYBMwUUx%2FkkWnFYTUEO3moH7AT5aiCXq1zk8mRJdIidAsZH6v%2BwHbdBx3SYKgZSHSdFgUeMAnzlz81zEwGFDveVqPAaKDXWFTPt5hj5RdGvVXjjRwI6A2%2FAjJRfNjdShtzyKs8AMx8%2BlQxmijKlgTDjOMAKAQBN8IMu7GcOBj1H0AL7nMyKwlnQJjHDAH0scFgHdDvwxwE0F101hgJas5mRLG1cQFscoEtLQjqmGeac4gbNOpk7K7hjvlebkDesQXTPyEFZgdemCy6I9vl5aC9wRXSfqvGq%2F2ISYJpNSh8uAXM2dWr0koBqpKJj5HkJkiMlfMg6t0A77Mo1DWosarIT7TO314XJtrT8nEP8XIqHWFiImWFM6krABj3VgNKUCfUUNUDkKYBrFCwyo5%2BJDBCncFUXjrwrdL5vsquo2bxP2WvSrCBykQcPmbneKWI3YjW1ef5nm0gaY9jMh8qTDjpGkq1R%2BDB3H1WSBR4F%2BoUqlDI2WTvu9gAyGrSa8J8rg1yA%2Fli7JUPFVBkwWPpAWLFl4oZuzJS5aVk6mGuGbo9rtmja9UFWEPMQy5zgkrHODUOVi8tODrRvD786izprKC0aRdydTQeOhVhRSPYdIVZEpUCzrwxZ%2FfYgaxbcVEB2cLDDMJXrQvZ6hRrJYb0MYJJc6g6xi2QyVvDZDzcJc1frvyl%2FsY9n%2Bd2NPlk1lKR%2FwPSnTznQWxqbu0%2FuDxnthkqSPptB1%2F2Vrno1%2BU3mPTxPdYR5D9dcm4ZZ9%2FYulfZgrVNTlI03BWkPoMrKe2i8H%2FTxNcWqO%2Bmj98%2BNrOmWXtPyJHhQHA8IrFEjoVT8HUr%2Fgvq9r1uutRT8SLFJmZCtqQ521YsnSxQjsUE0yQq%2BSKbUIIqn%2B7XB7QxU7%2BVIN1rtyERRLVVAgKqAAKWVI%2BmCGrd7uaOceiRdEaPjSD2SCAvS6pF0PlyT3InmpyAaoaU1LtHwkZU70cgiGu3GiUZwl9G9sPp9FVazlsz86gTD10jcC6sl8Yt54%2FzCO%2FUtULh8OSOTLzopjX9CNZew4Ew9niWYDPL4j5qKN%2BXyc0bPYJefrfcyR47pG7zLPxqASQoJMAVamql3wFiYQhqSypJcuKUJ0qcnOWtSYlVMMYitgaHAVUBTLdsjA5cPJ4xeglUDW0eJ909VenUVIWkxBM4WCKbOymZh3F8gmNIae%2BTgrckz%2BRdsqXECcUU%2FR1Ok%2BzmK2M85LWNlKnAOLJGfoz5aZv58s%2FaHcG6yRHX%2Bvljsz35YLHLR9NSc86P59LRcMkJJfS7Pu5AvZXC1tZz9XD7wo24%2Fl9WIl38KiMqhVgJij6JyCIjaHWDOZXac%2BZzDiAgElMh77fMRBmh1lrS%2Bm61I22xRlR7NkMdoIsqRkw2f5uUB5DnBdscjfZ3IJeM4VASrjnixNwe4QdN9QNxX4pfzRSZMPYfyoeqzgjGsf2MJFEU5nnbPz4XPxseoNR9fQ1hHLGCHvXryLc6r75eQ7wrjnAFCtb8123DRL2PhMkpYY3SwvFsCTD7qjLciQB92KDzwDw8V7HQrh523144jLr4YZ6%2Fn8raaufUPsJabxL3m7%2FrDA04dmDpbbqeJnVyoLErxNdeDtrRueYsVXw1U9w7a6aPpmldlIapiNjzm6pZA%2BjloRJky1cfFH3nv6MSakgsXix41NLpvLxTcX3hE4i%2Fukhj2zJ5XL7sgliLkCcBMtWodrGH%2BijHH3mdtmDkjTPpM05XqNW45v8mnbbDFlEmXAopHFl6BTRFwDSR0DOampUFTuuZURqNTlQ1pyqNTS%2BQD3KpZiGHUeDicyMo7a7qm3VlM12J4tpyAuAz0bnhKtEYYw5MN40uUnvfkVC2i9Xiyk09WSY6RCc6yfKS%2FevfgBgqSKkyyXkaQgNEQJPZuVYmCdOQhWTcgSOtD4ocoYW83kShGEscvWpZbGAc%2Bo%2BAMRZE5O%2BGA4keDjDsF3D4FAPahPhI5oP1x6LfAAc4WOd%2BxOhWGKH%2BLQpgIFN4dyzcUkGSTghKhzPvQtwTl1UMHMt%2BzBiO%2FdITF7xparLdHeNbswpsP7xRzorrU5KjL8ZIeNl8J%2BzF0%2B2yxnPCcAXTRTxuWOXT%2BV8lU%2BntlUjdflGWVFLUbT7%2FYoqcBvKfch6Zrk0buo3qcRd4BWOaknvyYZU8KOiP%2FMaSqcfT8RyHT3fkPOSVZpsEgmqlG6JvgYMdhS1gkpzBsvjJ8RYpOrkaOZVFTb3Isi53eKzmyFXljUSNQbudxVFUV9LdJL4IS3OAPOsirBydd%2Bgb%2FU7y6s5%2FgwzxMQmPjEf1v8J93jDSYlPBhHBETveqOWWD7BdvjpMf%2FAQ%3D%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E
 * */