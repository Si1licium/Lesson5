public class Bararaban implements Instrument{
    private String size ="50";

    @Override
    public String toString() {
        return "Bararaban{" +
                "size=" + size +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public void play(){
        System.out.println("haracteristic " + getSize());
    }

}

