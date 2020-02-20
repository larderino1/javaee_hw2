import java.util.List;

public class KmaMemes implements Performer{

    private List<MemWorker> workerList;

    public void setWorkerList(List<MemWorker> workerList) {
        this.workerList = workerList;
    }

    public void perform() {
        for(MemWorker worker : workerList)
        worker.play();
    }
}
