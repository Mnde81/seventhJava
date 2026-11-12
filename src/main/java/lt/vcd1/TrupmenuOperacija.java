package lt.vcd1;

public class TrupmenuOperacija {

    private Trupmena t1;
    private Trupmena t2;

    private char veiksmas;

    TrupmenuOperacija(Trupmena t1, Trupmena t2, char veiksmas){
        this.t1=t1;
        this.t2=t2;
        this.veiksmas=veiksmas;
    }

    @Override
    public String toString() {
        return t1.toString()+veiksmas+t2+"=";
    }

    public double rezultatas() {
        if (veiksmas == '+') {
            return t1.toDouble() + t2.toDouble();
        }
        if (veiksmas == '-') {
            return t1.toDouble() - t2.toDouble();
        }
        if (veiksmas == '*') {
            return t1.toDouble() * t2.toDouble();
        }
        if (veiksmas == '/') {
            return t1.toDouble() / t2.toDouble();
        }

        return 0;
    }

}
