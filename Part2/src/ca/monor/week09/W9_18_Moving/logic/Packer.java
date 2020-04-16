package ca.monor.week09.W9_18_Moving.logic;

import ca.monor.week09.W9_18_Moving.Thing;
import ca.monor.week09.W9_18_Moving.domain.Box;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>(); // 定义盒子数组，放其他盒子进来
        int boxNumber = 0; //定义 box 编号
        for (Thing t :
                things) {
            boxes.add(new Box(this.boxesVolume)); //在数数组中加入一个新盒子
            boxes.get(boxNumber).addThing(t); //在盒子中添加 things
            boxNumber++; //盒子装满了就换新盒子
        }
        return boxes;
    }
}
