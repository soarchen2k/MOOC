package ca.monor.week10.w10_28_Groups.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movableList = new ArrayList<Movable>();

    public void addToGroup(Movable movable) {
        movableList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : movableList) m.move(dx, dy);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Movable s : movableList) string.append(s).append("\n");
        return string.toString();
    }
}
