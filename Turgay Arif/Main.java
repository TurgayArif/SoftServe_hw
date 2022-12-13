public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 4, BodyMaterial.PLASTIC);
        System.out.println("The price of " + camera.getModel() + " is: $"+camera.cost());
        camera.info();
        DigitalCamera camera1 = new DigitalCamera("Sony", 3, BodyMaterial.METAL, 8);
        System.out.println("The price of " + camera1.getModel() + " is: $"+camera1.cost());
        if (camera1.isExpensive()) {
            System.out.println("The " + camera1.getModel() + " is expensive!");
        } else {
            System.out.println("The " + camera1.getModel() + " is not expensive!");
        }
        camera1.info();
        DigitalCamera camera2 = new DigitalCamera("Sony", 4, BodyMaterial.METAL, 10);
        camera2.updateModel();
        camera2.info();
    }
}
