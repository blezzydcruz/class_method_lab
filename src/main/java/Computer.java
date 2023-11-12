public class Computer {

    private int computerStorage;
    private String printerModel;

    public Computer(int computerStorage) {
        this.computerStorage = computerStorage;
        this.printerModel = null;   //printer isn't initially connected, can use `null` or `""`
    }

    public int getComputerStorage() {
        return computerStorage;     //instead of `computerStorage` or `this.computerStorage`
    }

    public void addStorage(int newStorage) {
        computerStorage += newStorage;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public String getPrinterModel() {
        return printerModel;
    }
}
