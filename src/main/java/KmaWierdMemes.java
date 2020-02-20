import java.util.Map;

public class KmaWierdMemes implements Performer{

    private Map<String, MemWorker> instruments;
    public void setInstruments(Map<String, MemWorker> instruments) {
        this.instruments = instruments;
    }

    public void perform(){
        for (String key: instruments.keySet()){
            System.out.println(key+ " : ");
            MemWorker instrument = instruments.get(key);
            instrument.play();
        }
    }


}
