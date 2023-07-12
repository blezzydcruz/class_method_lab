public class Computer {

    int computerStorage;
    String printerModel;

    public Computer(int computerStorage) {
        this.computerStorage = computerStorage;
        this.printerModel = null;   //printer isn't initially connected
    }

    public int getComputerStorage() {
        return computerStorage;
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
