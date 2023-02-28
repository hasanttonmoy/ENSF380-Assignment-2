public class Pet {
    private String NAME;
    private String SPECIES;
    private String BREED;
    private String COLOUR;
    private boolean vaccineStatus = false;
    private Client owner;
    private EmergVet vet;
    private CareProfile care;

    public Pet(String name, String species, String breed, String colour, Client owner) {
        this.NAME = name;
        this.SPECIES = species;
        this.BREED = breed;
        this.COLOUR = colour;
        this.owner = owner;
    }

    public void setVet(EmergVet vet) {
        this.vet = vet;
    }

    public EmergVet getVet() {
        return vet;
    }

    public void updateVaccineStatus(boolean change) {
        this.vaccineStatus = change;
    }

    public boolean getVaccineStatus() {
        return vaccineStatus;
    }

    public void setCare(String[] medList, String meds, String feeding) {
        care = new CareProfile(medList, meds, feeding);
    }

    public String getCareSummary() {
        return "Care for " + NAME + ":\n" + care.summarizeCareInstructions();
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client updateOwner) {
        owner = updateOwner;
    }

    public String getName() {
        return NAME;
    }

    public String getSpecies() {
        return SPECIES;
    }

    public String getBreed() {
        return BREED;
    }

    public String getColour() {
        return COLOUR;
    }
}
