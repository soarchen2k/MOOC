package ca.monor.week10.w10_29_PersonAndTheirHeirs.cours.InheritanceOfClassFeatures;

public class Motor extends Component {
    private String motorType;

    public Motor() {
    }

    public Motor(String motorType, String id, String producer, String description) {
        super(id, producer, description);
        this.motorType = motorType;
    }

    public String getMotorType() {
        return motorType;
    }
}
