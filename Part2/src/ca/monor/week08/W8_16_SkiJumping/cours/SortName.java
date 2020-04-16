package ca.monor.week08.W8_16_SkiJumping.cours;

import java.util.Comparator;

public class SortName implements Comparator<ClubMember> {
    @Override
    public int compare(ClubMember o1, ClubMember o2) {
        return o1.compareTo(o2);
    }
}
