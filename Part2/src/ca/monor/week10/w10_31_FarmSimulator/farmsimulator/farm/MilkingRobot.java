package ca.monor.week10.w10_31_FarmSimulator.farmsimulator.farm;

import ca.monor.week10.w10_31_FarmSimulator.farmsimulator.Milkable;

public class MilkingRobot {
    private BulkTank bulktank;

    public BulkTank getBulkTank() {
        return this.bulktank;
    }

    public void setBulkTank(BulkTank tank) {
        this.bulktank = tank;
    }

    public void milk(Milkable milkable) {
        if (this.bulktank == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }

        this.bulktank.addToTank(milkable.milk());
    }
}
