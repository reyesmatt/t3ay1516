package keith.lim.ex8;

/**
 * Created by kiiiiibble on 7/26/2016.
 */
public class Shape {

    //all shapes contain x and y coordinates.
    float x;
    float y;

    public Shape(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
