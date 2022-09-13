public class Gitara implements Instrument{
    private String strun = "6";

    public String getStrun() {
        return strun;
    }

    public void setStrun(String strun) {
        this.strun = strun;
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "strun='" + strun + '\'' +
                '}';
    }

    public void play(){
        System.out.println("haracteristic " + getStrun());
    }
}
