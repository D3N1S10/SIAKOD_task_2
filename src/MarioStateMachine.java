import java.util.Scanner;

public class MarioStateMachine {
    private MarioState currentState;
    private static MarioStateMachine instance;

    private MarioStateMachine() {
        currentState = new SmallMarioState();
    }

    public static MarioStateMachine getInstance() {
        if (instance == null) {
            instance = new MarioStateMachine();
        }
        return instance;
    }

    public void setCurrentState(MarioState state) {
        currentState = state;
    }

    public void jump() {
        currentState.jump();
    }

    public void shoot() {
        currentState.shoot();
    }

    public void powerUp() {
        currentState.powerUp();
    }

    public void powerDown() {
        currentState.powerDown();
    }

    public static void main(String[] args) {
        MarioStateMachine mario = MarioStateMachine.getInstance();
        Scanner scanner = new Scanner(System.in);

        boolean exitFlag = false;

        while (!exitFlag) {
            System.out.println("Выберите действие:");
            System.out.println("1 - прыжок, 2 - выстрел, 3 - улучшение, 4 - понижение, 0 - выход");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> mario.jump();
                    case 2 -> mario.shoot();
                    case 3 -> mario.powerUp();
                    case 4 -> mario.powerDown();
                    case 0 -> {
                        System.out.println("Выход из программы.");
                        exitFlag = true;
                    }
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте снова.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}