package CirclePack;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing CirclePack.Circle [color: red, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
