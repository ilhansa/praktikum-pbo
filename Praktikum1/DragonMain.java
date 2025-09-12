public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        //dragon 1
        dragon1.changeDirection(1);
        dragon1.move(3);
        dragon1.printStatus();

        //dragon 2
        dragon2.changeDirection(4);
        dragon2.move(4);
        dragon2.changeDirection(1);
        dragon2.move(5);
        dragon2.printStatus();
    }
}

