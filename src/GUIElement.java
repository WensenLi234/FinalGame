import java.awt.*;

public class GUIElement {
    private int x;
    private int y;
    public GUIElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void paint(Graphics g) {
        // not meant to do anything
    }
}
