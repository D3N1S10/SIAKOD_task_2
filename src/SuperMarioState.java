public class SuperMarioState implements MarioState {

    public void jump() {
        System.out.println("Супер Марио прыгает очень высоко");
    }

    public void shoot() {
        System.out.println("Супер Марио не умеет стрелять");
    }

    public void powerUp() {
        System.out.println("Супер Марио становится Огненным Марио");
        MarioStateMachine.getInstance().setCurrentState(new FireMarioState());
    }

    public void powerDown() {
        System.out.println("Супер Марио снижает мощность до Маленького Марио");
        MarioStateMachine.getInstance().setCurrentState(new SmallMarioState());
    }
}