package ir.sharif.ap.phase3.model.main;

public class Image {
    private static int lastID = 0;
    private final int id;

    public Image() {
        lastID++;
        this.id = lastID;
    }

    public static void setLastID(int lastID) {
        Image.lastID = lastID;
    }

    public int getId() {
        return id;
    }

    public static int getLastID() {
        return lastID;
    }
}