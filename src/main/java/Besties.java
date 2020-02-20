public class Besties implements Performer {
    private String bestOfBesties;
    private MemWorker worker;
    public void perform() {
        System.out.println("kek " + bestOfBesties + ":");
        worker.play();
    }

    public String getBestOfBesties() {
        return bestOfBesties;
    }

    public void setBestOfBesties(String bestOfBesties) {
        this.bestOfBesties = bestOfBesties;
    }

    public void setWorker(MemWorker worker) {
        this.worker = worker;
    }
}
