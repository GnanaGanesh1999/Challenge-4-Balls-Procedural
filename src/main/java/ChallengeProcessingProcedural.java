import processing.core.PApplet;

public class ChallengeProcessingProcedural extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 720;
    public static final int DIAMETER = 20;
    public static final int SPEED_OF_BALL_1 = 1;
    public static final int SPEED_OF_BALL_2 = 2;
    public static final int SPEED_OF_BALL_3 = 3;
    public static final int SPEED_OF_BALL_4 = 4;
    public int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
    public static final int y1 = HEIGHT / 5, y2 = HEIGHT / 5 * 2, y3 = HEIGHT / 5 * 3, y4 = HEIGHT / 5 * 4;

    public static void main(String[] args) {
        PApplet.main("ChallengeProcessingProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawCircles();
        moveCircles();
    }

    private void drawCircles() {
        drawCircle(x1, y1);
        drawCircle(x2, y2);
        drawCircle(x3, y3);
        drawCircle(x4, y4);
    }

    private void moveCircles() {
        x1 += SPEED_OF_BALL_1;
        x2 += SPEED_OF_BALL_2;
        x3 += SPEED_OF_BALL_3;
        x4 += SPEED_OF_BALL_4;
    }

    private void drawCircle(int x, int y) {
        ellipse(x, y, DIAMETER, DIAMETER);
    }
}

