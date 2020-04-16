package ca.monor.week08.W8_16_SkiJumping.cours;

public class ClubMember implements Comparable<ClubMember> {

    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(ClubMember o) {
        return this.getHeight() - o.getHeight();
    }

    @Override
    public String toString() {
        return "ClubMember{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
