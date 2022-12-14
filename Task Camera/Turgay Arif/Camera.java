

public class Camera {
    private String model;
    private int opticalZoom;
    private BodyMaterial bodyMaterial;


    public Camera(String model, int opticalZoom, BodyMaterial body) {
        this.model = model;
        this.opticalZoom = opticalZoom;
        this.bodyMaterial = body;
    }

    public String getModel() {
        return model;
    }

    public int getOpticalZoom() {
        return opticalZoom;
    }

    public int cost() {
        var price = 0;
        if (bodyMaterial.toString().equalsIgnoreCase(BodyMaterial.PLASTIC.toString())) {
            price = (opticalZoom +2) * 10;
            return price;
        }
        price = (opticalZoom + 2) * 15;
        return price;
    }

    public boolean isExpensive() {
        return cost() > 200;
    }

    public void info() {
        System.out.printf("Model: %s%n" +
                "Zoom: %d%n" +
                "Cost: $%d%n", model, opticalZoom, cost());
    }
}
