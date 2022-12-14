public class DigitalCamera extends Camera {
    private int megaPixels;

    public DigitalCamera(String model, int opticalZoom, BodyMaterial bodyMaterial, int megaPixels) {
        super(model, opticalZoom, bodyMaterial);
        this.megaPixels = megaPixels;
    }

    public void updateModel() {
        this.megaPixels += 2;
    }

    @Override
    public void info() {
        System.out.printf("Model: %s%n" +
                "Zoom: %dx Optical Zoom.%n" +
                "Cost: $%d%n" +
                "Mega Pixels: %d%n", getModel(), getOpticalZoom(), cost(), megaPixels);
    }
}
