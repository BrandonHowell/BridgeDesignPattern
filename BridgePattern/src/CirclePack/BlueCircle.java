package CirclePack;

public class BlueCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing CirclePack.Circle [color: blue, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
