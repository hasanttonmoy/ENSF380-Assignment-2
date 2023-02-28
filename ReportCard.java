public class ReportCard {
    private final Booking REPORT;

    public ReportCard(Booking reportInfo) {
        this.REPORT = reportInfo;
    }

    public String printReport() {
        String report = REPORT.getBookedPet().getName() + " enjoyed taking care of " + REPORT.getCaregiver().getName()
                + ". See you next time!";
        return report;
    }
}
