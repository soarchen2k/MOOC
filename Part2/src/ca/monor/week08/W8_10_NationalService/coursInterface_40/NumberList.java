package ca.monor.week08.W8_10_NationalService.coursInterface_40;

import java.util.ArrayList;

public class NumberList implements Readable {

    private ArrayList<Readable> readables;

    public NumberList() {
        this.readables = new ArrayList<Readable>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int howManyReadables() {
        return this.readables.size();
    }

    @Override
    public String read() {
        String read = "";
        for(Readable readable: this.readables) {
            read += readable.read() + "\n";
        }

        this.readables.clear();
        return read;
    }
}
