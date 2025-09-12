public class Dragon {
    int y;
    int x;
    int direction;
    
    Dragon() {}

    void changeDirection(int newDirection) {
        if (newDirection < 0 || newDirection > 4) {
            return;
        }
        this.direction = newDirection;
    }

    void move(int steps) {
        switch (direction) {
        case 1: // atas
            this.y += steps;
            break;
        case 2: // kanan
            this.x += steps;
            break;
        case 3: // bawah
            this.y -= steps;
            break;
        case 4: // kiri
            this.x -= steps;
            break;
        }
    }

    void printStatus() {
        System.out.println("x:" + x);
        System.out.println("y: " + y);
        System.out.println("direction: " + direction);
    }
}
