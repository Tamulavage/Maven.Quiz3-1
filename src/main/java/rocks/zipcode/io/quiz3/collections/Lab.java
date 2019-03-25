package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labname;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labname = labName;
    }

    public String getName() {
        return this.labname;
    }

    public void setStatus(LabStatus labStatus) {
    }

    public LabStatus getStatus() {
        return null;
    }
}
