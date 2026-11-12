package lt.vcd1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Trupmena t1 = new Trupmena(4, 5);
        Trupmena t2 = new Trupmena(2, 2, 5);

        TrupmenuOperacija veiksmas = new TrupmenuOperacija(t1, t2, '+');

//t1.prideti(2,2,5)

//t1.prideti(t2);

//t1.setSkaitiklis(2);
//t2.setSkaitiklis(5);

        System.out.print(veiksmas);
        System.out.println(veiksmas.rezultatas());
//System.out.println(t1);
        //System.out.println(t2.toDouble());



    }
}
