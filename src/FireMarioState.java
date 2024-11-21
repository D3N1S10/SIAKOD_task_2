public class FireMarioState implements MarioState {

    public void jump() {
        System.out.println("Огенный Марио прыгает очень высоко");
    }

    public void shoot() {
        System.out.println("Огенный Марио стреляет огненным шаром");
    }

    public void powerUp() {
        System.out.println("Огненный Марио уже на самом высоком уровне");
    }

    public void powerDown() {
        System.out.println("Огненный Марио снижает мощность до Супер Марио");
        MarioStateMachine.getInstance().setCurrentState(new SuperMarioState());
    }
}