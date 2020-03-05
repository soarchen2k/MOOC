package monor.week06.exercise100_NightSky;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int numberOFStars;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = .1;
        this.width = width;
        this.height = height;
    }

    public NightSky() {
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void print() {
        this.numberOFStars = 0;
        for (int i = 1; i <= height; i++) {
            printLine();
            System.out.println();
        }
    }

    public void printLine() {
        Random random = new Random();
        for (int j = 1; j <= width; j++) {
            if (random.nextDouble() < this.density) {
                System.out.print("*");
                this.numberOFStars++;
            } else System.out.print(" ");
        }
    }
    public int starsInLastPrint() {
        return this.numberOFStars;
    }
}
