public class HybridEngine implements IEngine {
    private IEngine currentEngine;
    private ElectricEngine electricEngine = new ElectricEngine();
    private GasEngine gasEngine = new GasEngine();
    private int engineSpeed=0;

    public HybridEngine()
    {
        this.currentEngine = electricEngine;
    }

    @Override
    public void increaseSpeed(int speed) {
        if(speed<50)
            currentEngine = electricEngine;
        else
            currentEngine = gasEngine;

        System.out.println("Current Engine = " + currentEngine.getClass());
        currentEngine.increaseSpeed(speed);
    }

    @Override
    public void decreaseSpeed(int speed) {
        if(speed<50)
            currentEngine = electricEngine;
        else
            currentEngine = gasEngine;

        System.out.println("Current Engine = " + currentEngine.getClass());
        currentEngine.decreaseSpeed(speed);
    }
}

