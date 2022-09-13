public class Main {
    public static void main (String[] args){


        String[] instruments = new String[] {"Gitara","Baraban","Truba"};

        for (int i = 0; i< instruments.length; i++){
            System.out.println("Play " + instruments[i] + ", with ");

            Gitara gitaras = new Gitara();
            gitaras.play();


            Bararaban bararabans = new Bararaban();
            bararabans.play();

            Truba trubas = new Truba();
            trubas.play();

        }
    }
}
