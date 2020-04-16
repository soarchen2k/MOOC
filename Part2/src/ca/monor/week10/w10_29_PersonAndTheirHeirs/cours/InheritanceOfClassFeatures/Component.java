package ca.monor.week10.w10_29_PersonAndTheirHeirs.cours.InheritanceOfClassFeatures;

public class Component {
    private String id;
    private String producer;
    private String description;

    public Component() {
    }

    public Component(String id, String producer, String description) {
        this.id = id;
        this.producer = producer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getDescription() {
        return description;
    }
}
