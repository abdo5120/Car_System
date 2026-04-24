public class Car {
    private IEngine engine;
    private int currentSpeed = 0;
    private boolean running = false;

    public Car(IEngine engine){
        this.engine=engine;
    }

    public void setEngine(IEngine engine) {
        if(running)
        {
            System.out.println("Car is Running, can not replace the engine.");
            return;
        }
        this.engine = engine;
        System.out.println("The engine has been replaced with " + engine.getClass());
    }

    public void start()
    {
        if(running)
        {
            System.out.println("Car is already Running");
            return;
        }

        this.currentSpeed = 0;
        running = true;
        System.out.println("Car has started!!");
    }

    public void stop()
    {
        if(!running)
        {
            System.out.println("Car is already stopped!!");
            return;
        }

        if(this.currentSpeed ==0)
        {
            System.out.println("Car has stopped!!");
            running = false;
        }
        else
            System.out.println("Car can not stop -- currentSpeed must be 0km");
    }

    public void accelerate()
    {
        if(!running)
        {
            System.out.println("Car must be Running");
            return;
        }

        if(this.currentSpeed <200) {
            currentSpeed +=20;
            engine.increaseSpeed(currentSpeed);
        }
        else
            System.out.println("Car can not accelerate - currentSpeed must be less than 200km");
    }

    public void brake() {
        if(this.currentSpeed >0) {
            currentSpeed -= 20;
            engine.decreaseSpeed(currentSpeed);
        }
        else
            System.out.println("Car can not brake - currentSpeed must be greater than 0km");
    }
}

