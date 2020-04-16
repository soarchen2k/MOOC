package ca.monor.week07.W7_05_Nicknames;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nickname = new HashMap<String, String>();
        nickname.put("matti", "mage");
        nickname.put("mikael", "mixu");
        nickname.put("arto", "arppa");

        String mikaelNickName = nickname.get("mikael");
        System.out.println(mikaelNickName);
    }
}
