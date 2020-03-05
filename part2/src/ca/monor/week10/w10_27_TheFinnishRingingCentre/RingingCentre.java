package ca.monor.week10.w10_27_TheFinnishRingingCentre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, List<String>> observationPlaces;

    public RingingCentre() {
        observationPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!observationPlaces.containsKey(bird)) {
            // 直接在方法中创建对象的 ArrayList ，后续的一切操作都是调用该对象的对象
            observationPlaces.put(bird, new ArrayList<String>());
            observationPlaces.get(bird).add(place);
        } else {
            observationPlaces.get(bird).add(place); }
    }

    public void observations(Bird bird) {
        if (!(bird == null) && !(observationPlaces.get(bird) == null)) {
            System.out.println(bird + " observations: " + observationPlaces.get(bird).size());
            for (String place :
                    observationPlaces.get(bird)) {
                System.out.println(place);
            }
        } else if (!(bird == null)) {
            System.out.println(bird + " observations: " + 0);
        }
    }
}