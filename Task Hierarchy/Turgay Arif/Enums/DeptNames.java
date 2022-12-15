package Enums;

public enum DeptNames {
    HR("Human Resources"),
    IT("Information Technology"),
    CEO("Chief Executive Officer");
    final String displayName;

    DeptNames(String displayName) {
        this.displayName = displayName;
    }


    @Override
    public String toString() {
        return this.displayName;
    }
}
