public enum BodyMaterial {

    PLASTIC("Plastic"),
    METAL("Metal");

    private String displayName;

    BodyMaterial(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}

