package scers.model;

public class Witness extends User {
    private int reportsSubmitted;

    public Witness(String userId, String name, String phone) {
        super(userId, name, phone);
        this.reportsSubmitted = 0;
    }

    public int getReportsSubmitted() {
        return reportsSubmitted;
    }

    public void incrementReportsSubmitted() {
        this.reportsSubmitted++;
    }
}
