public class CareProfile {
    private String[] medList;
    private String medInstructions;
    private String feedingInstructions;

    public CareProfile(String[] medList, String meds, String feeding) {
        this.medList = medList;
        this.medInstructions = meds;
        this.feedingInstructions = feeding;
    }

    public String summarizeCareInstructions() {
        String medListString = String.join(", ", this.medList);
        String result = "";
        result += "" + medListString + "\n";
        result += "" + this.medInstructions + "\n";
        result += "" + this.feedingInstructions + "\n";
        return result;
    }
}
