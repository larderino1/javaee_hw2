public class KekLol implements Performer{

    int beans;

    public KekLol(){
        this(100500);
    }
    public KekLol(int beansMem){
        this.beans = beansMem;
    }
    public void perform() {
        System.out.println("kekLol "+beans+" beans");
    }
}
