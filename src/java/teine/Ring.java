package java.teine;

public class Ring {
    public double raadius;
    public String varv;

    public Ring() {
        this.raadius = 0.0;
        this.varv = "värvitu";
    }

    public Ring(double raadius) {
        this.raadius = raadius;
        this.varv = "värvitu";
    }

    public Ring(double raadius, String varv) {
        this.raadius = raadius;
        this.varv = varv;
    }

    public double ringjoonePikkus() {
        return 2 * Math.PI * this.raadius;
    }


    @Override
    public String toString() {
        return "Antud ring on raadiusega " +
                raadius + " ja " + varv + " värviga";
    }
}
