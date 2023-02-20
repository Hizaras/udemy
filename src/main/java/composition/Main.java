package composition;

public class Main {
    public static void main(String[] args) {
        Dimentions dimentions = new Dimentions(20, 20, 5);
        Case aCase = new Case("220b", "Dell",
                "240", dimentions);
        Monitor theMonitor = new Monitor("27 inch Beast","Acer",
                27, new Resolution(2540, 1440));
        MotherBoard motherBoard = new MotherBoard("B-J200",
                "Asus", 4,6, "v2.44");
        Pc myPc = new Pc(aCase, theMonitor, motherBoard);
        myPc.getMonitor().drawPixelAt(1500, 1200,"red");;
         myPc.getMotherBoard().loadProgram("Windows 1.0");
         myPc.getaCase().pressPowerButton();
    }
}
