public class GasEngine implements IEngine {
    private int speedEngine=0;

    @Override
    public void increaseSpeed(int speed) {
        while(speed>speedEngine)
        {
            speedEngine++;
            System.out.println("increase speed : " + speedEngine + "km");
        }
        System.out.println("Current Speed = " + speed);
    }

    @Override
    public void decreaseSpeed(int speed) {
        while(speed<speedEngine)
        {
            speedEngine--;
            System.out.println("decrease speed : " + speedEngine + "km");
        }
        System.out.println("Current Speed = " + speed);
    }
}
