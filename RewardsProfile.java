public class RewardsProfile {
    private String rewardsNum;
    private int pointsTotal;

    public RewardsProfile() {
        this.rewardsNum = "Not enrolled";
        this.pointsTotal = 10;
    }

    public RewardsProfile(String newNumber) throws InvalidRewardsNumException {
        if (newNumber.length() != 7 || !newNumber.matches("[0-9]+")) {
            throw new InvalidRewardsNumException();
        }
        this.rewardsNum = newNumber;
        this.pointsTotal = 10;
    }

    public String getNumber() {
        return rewardsNum;
    }

    public int getPoints() {
        return pointsTotal;
    }

    public void setPoints(int addPoints) {
        this.pointsTotal += addPoints;
    }
}
