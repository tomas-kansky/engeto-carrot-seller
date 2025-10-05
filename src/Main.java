import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarrotSeller carrotSeller1 = new CarrotSeller();
        CarrotSeller carrotSeller2 = new CarrotSeller();

        carrotSeller1.setName("Tomáš Kanský");
        carrotSeller1.setBirthDate(LocalDate.of(2001,9,5));
        carrotSeller1.setNumberOfContracts(36);
        carrotSeller1.setCarrotsSoldTons(4.87);
        carrotSeller1.setSenior(false);

        carrotSeller2.setName("Daniel Mutl");
        carrotSeller2.setBirthDate(LocalDate.of(2001,9,19));
        carrotSeller2.setNumberOfContracts(23);
        carrotSeller2.setCarrotsSoldTons(2.34);
        carrotSeller2.setSenior(false);

        System.out.println("*** PŘÍBĚH O PRODEJCÍCH MRKVÍ ***");
        System.out.println();
        System.out.println("Dovol mi říct ti příběh o dvou prodejcích mrkví.");
        System.out.println();
        System.out.println("Na tržišti se potkali dva rivalové " + carrotSeller1.getName() +
                " narozený " + carrotSeller1.getBirthDate() + ", který se pyšnil, tím, že má už " +
                carrotSeller1.getNumberOfContracts() + " uzavřených smluv a prodal přes " +
                carrotSeller1.getCarrotsSoldTons() + " tun mrkví,\na jeho soupeř " +
                carrotSeller2.getName() + ", jenž věří, že úspěch se neměří jen čísly," +
                " ale i důvěrou zákazníků.");
        System.out.println();
        System.out.println("--- Příběh dál nepokračuje, protože během programování " +
                "jsem se moc unavil ---");
        System.out.println();
        System.out.println("Je " + carrotSeller2.getName() + " senior? " + carrotSeller2.isSenior());
        
    }
}