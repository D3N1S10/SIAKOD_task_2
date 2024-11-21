public class SmallMarioState implements MarioState {
    public void jump() {
        System.out.println("Маленький Марио прыгает");
    }

    public void shoot() {
        System.out.println("Маленький Марио не умеет стрелять");
    }

    public void powerUp() {
        System.out.println("Маленький Марио становится Супер Марио");
        MarioStateMachine.getInstance().setCurrentState(new SuperMarioState());
    }

    public void powerDown() {
        System.out.println("Маленький Марио уже является самым низким состоянием");
    }
}