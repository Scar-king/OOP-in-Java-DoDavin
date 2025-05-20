package Football;

public class Main {
    public static void main(String[] args){
        Ball ball1 = new Ball(5.0f, 5.0f, 3, 2.5f, 2.5f);

        System.out.println("Initial Ball Position:");
        System.out.println(ball1);

        ball1.move();
        System.out.println("Ball Position after move:");
        System.out.println(ball1);

        ball1.reflectHorizontal();
        System.out.println("Ball Position after reflect Horizontal:");
        System.out.println(ball1);

        ball1.reflectVertical();
        System.out.println("Ball Position after reflect Vertical:");
        System.out.println(ball1);
        
    }
}
