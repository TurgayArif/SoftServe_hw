package Enums;

public enum Position {
    CEO("Chief Executive Officer"),
    COO("Chief Operational Officer"),
    CTO("Chief Technology Officer"),
    CMO("Chief Marketing Officer"),
    MANAGER("Manager"),
    TEAM_MEMBER("Team Member");


    final String displayName;

    Position(String displayName) {
        this.displayName = displayName;
    }


    @Override
    public String toString() {
        return this.displayName;
    }
}
