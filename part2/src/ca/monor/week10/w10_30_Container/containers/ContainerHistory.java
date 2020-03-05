package ca.monor.week10.w10_30_Container.containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {
    private List<Double> containerList;

    public ContainerHistory() {
        containerList = new ArrayList<Double>();
    }

    public void add(double situation) {
        containerList.add(situation);
    }

    public void reset() {
        containerList.clear();
    }

    public double maxValue() {
        return findMax(containerList, 0, containerList.size() - 1);
    }

    public double minValue() {
        return findMin(containerList, 0, containerList.size() - 1);
    }

    public double average() {
        if (containerList.size()==0) return 0;
        double num = (double) containerList.size();
        double sum = 0;
        for (double d :
                containerList) {
            sum += d;
        }
        return sum / num;
    }

    public double greatestFluctuation() {
        if (containerList.size() == 0 || containerList.size() == 1) {
            return 0;
        }
        if (containerList.size() == 2) {
            return Math.abs(containerList.get(0) - containerList.get(1));
        }
        double greatestFluctuation = Math.abs(containerList.get(0) - containerList.get(1));
        for (int i = 1; i < containerList.size() - 1; i++) {
            greatestFluctuation = Math.max(greatestFluctuation, (Math.abs(containerList.get(i) - containerList.get(i + 1))));
        }
        return greatestFluctuation;
    }

    public double variance() {
        double avg = this.average();
        double sumVar = 0;
        for (double d :
                containerList) {
            sumVar += Math.pow((d - avg), 2);
        }
        return sumVar / (containerList.size() - 1);
    }

    private double findMin(List<Double> containerList, int left, int right) {
        if (containerList.size() == 0) return Integer.parseInt(null);
        if (containerList.size() == 1) return containerList.get(0);
        if (left == right) return containerList.get(left);

        int mid = left + (right - left >> 1);
        double minLeft = findMin(containerList, left, mid);
        double minRight = findMin(containerList, mid + 1, right);
        return Math.min(minLeft, minRight);
    }

    private double findMax(List<Double> containerList, int left, int right) {
        if (containerList.size() == 0) return Integer.parseInt(null);
        if (containerList.size() == 1) return containerList.get(0);
        if (left == right) return containerList.get(left);

        int mid = left + (right - left >> 1);
        double maxLeft = findMax(containerList, left, mid);
        double maxRight = findMax(containerList, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    public String toString() {
        return containerList.toString();
    }
}
