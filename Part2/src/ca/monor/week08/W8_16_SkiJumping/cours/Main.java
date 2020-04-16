package ca.monor.week08.W8_16_SkiJumping.cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClubMember> clubMembers = new ArrayList<ClubMember>();
        clubMembers.add(new ClubMember("mikael", 182));
        clubMembers.add(new ClubMember("matti", 187));
        clubMembers.add(new ClubMember("joel", 184));

//        Collections.sort(clubMembers, Comparator.comparing(ClubMember::getName));

        Collections.sort(clubMembers);
        for (ClubMember c :
                clubMembers) {
            System.out.println(c);
        }

        ClubMember wanted = new ClubMember("mikael", 184);
        if (Collections.binarySearch(clubMembers, wanted) >= 0) {
            System.out.println(clubMembers.get(Collections.binarySearch(clubMembers, wanted)));
        }
    }
}
