package lt.vcd1;

public class Trupmena{
    private int skaitiklis;
    private int daliklis;
    private int sveikojiDalis;

    Trupmena(int skaitiklis, int daliklis){
        this.skaitiklis=skaitiklis;
        this.daliklis=daliklis;
    }

    Trupmena(int sveikojiDalis, int skaitiklis, int daliklis){
        this.sveikojiDalis=sveikojiDalis;
       this(skaitiklis, daliklis);

    }

    public void setSkaitiklis(int skaitiklis) {
        this.skaitiklis = skaitiklis;
        prastinti();
    }

    public void setDaliklis(int daliklis) {
        this.daliklis = daliklis;
        prastinti();
    }

    public void setSveikojiDalis(int sveikojiDalis) {
        this.sveikojiDalis = sveikojiDalis;
    }

    public int getSkaitiklis() {
        return skaitiklis;
    }

    public int getDaliklis() {
        return daliklis;
    }

    public int getSveikojiDalis() {
        return sveikojiDalis;
    }

    @Override
    public String toString(){
        // super.toString();
        if (this.sveikojiDalis!=0){
            return this.sveikojiDalis +" " + this.skaitiklis +" / " + this.daliklis;
        } else {

        }
        return this.skaitiklis +" / " + this.daliklis;
    }

    private void prastinti(){
        int bdd=1;
        for (int i=2; i <=skaitiklis && i<=daliklis; i++){
            if(skaitiklis % i == 0 && daliklis % i ==0){
                bdd=i;
            }

        }
        skaitiklis /= bdd;
        daliklis /=bdd;

        if (skaitiklis>daliklis){
            sveikojiDalis+=skaitiklis / daliklis;
            skaitiklis %=daliklis;
        }
    }

    public double toDouble(){
        return sveikojiDalis+ (double) skaitiklis / daliklis;
    }


    public void pridetiPrieSkaitiklio(int skaitiklis){
        this.skaitiklis = this.skaitiklis +skaitiklis;
    }


    public void prideti(int skaitiklis, int daliklis){
        this.skaitiklis=this.skaitiklis* daliklis+this.daliklis*skaitiklis;
        this.daliklis*=daliklis;
        prastinti();
    }

    public void prideti(int sveikojiDalis, int skaitiklis, int daliklis){
        this.sveikojiDalis+=sveikojiDalis;
        prideti(skaitiklis, daliklis);
    }

    public void prideti(Trupmena t) {
        prideti(t.getSveikojiDalis(), t.getSkaitiklis(), t.getDaliklis());
    }


}


