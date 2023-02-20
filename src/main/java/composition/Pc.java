package composition;

public class Pc {
    private Case aCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public Pc(Case aCase, Monitor monitor, MotherBoard motherBoard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getaCase() {
        return aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
