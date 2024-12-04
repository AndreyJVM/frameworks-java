package startJUnit.os;

public enum OS {
    WINDOWS, MAC, LINUX, OTHER;

    public static OS determine() {
        OS out = OTHER;
        String myOS = System.getProperty("os.name").toLowerCase();
        if (myOS.contains("win")) {
            out = WINDOWS;
        } else if (myOS.contains("mac")) {
            out = MAC;
        } else if (myOS.contains("nux")) {
            out = LINUX;
        }
        return out;
    }
}