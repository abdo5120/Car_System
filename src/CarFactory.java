public class CarFactory {
    public static Car createCar(String engineType){
        IEngine engine = null;
        switch (engineType) {
            case "gas" :
                engine = new GasEngine();
                break;
            case "electric" :
                engine = new ElectricEngine();
                break;
            case "hybrid" :
                engine = new HybridEngine();
                break;
            default:
                break;
        }

        return new Car(engine);
    }

    public static void replaceEngine(String engineType, Car car){
        IEngine newEngine = null;
        switch (engineType) {
            case "gas" :
                newEngine = new GasEngine();
                break;
            case "electric" :
                newEngine = new ElectricEngine();
                break;
            case "hybrid" :
                newEngine = new HybridEngine();
                break;
            default:
                break;
        }

        car.setEngine(newEngine);
    }
}
