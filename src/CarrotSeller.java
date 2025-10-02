import java.time.LocalDate;

public class CarrotSeller {
    private String name;
    private LocalDate birthDate;
    private int numberOfContracts;
    private double carrotsSoldTons;
    private boolean isSenior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public double getCarrotsSoldTons() {
        return carrotsSoldTons;
    }

    public void setCarrotsSoldTons(double carrotsSoldTons) {
        this.carrotsSoldTons = carrotsSoldTons;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public void setSenior(boolean senior) {
        isSenior = senior;
    }
}
