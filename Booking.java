public class Booking {
    private String startDate;
    private String endDate;
    private Pet bookedPet;
    private Employee caregiver;

    public Booking(Pet pet, Employee assigned, String startDate, String endDate) {
        this.bookedPet = pet;
        this.caregiver = assigned;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Pet getBookedPet() {
        return bookedPet;
    }

    public Employee getCaregiver() {
        return caregiver;
    }

    public ReportCard generateReportCard() {
        return new ReportCard(this);
    }
}
