public class Solar {

    public static void main(String[] args) {
        Solar s = new Solar();
        s.process();
    }

    public void process() {
        // 각 행성의 정보를 출력
        for (Planet planet : Planet.values()) {
            planet.print();
        }
    }

    public void planet(pla) {
        System.out.print("행성 이름 :" + pla.name + "행성 반지름:" + pla.r + "행성 둘레:" + pla.cir);
    }

    enum Planet {
        MERCURY("MERCURY", 2439), VENUS("VENUS", 6051), EARTH("EARTH", 6371), MARS("MARS", 3390),
        JUPITER("JUPITER", 69911), SATURN("SATURN", 58232), URANUS("URANUS", 25362), NEPTUNE("NEPTUNE", 24622);

        String name;
        int r;
        double cir;

        // 생성자
        Planet(String name, int r) {
            this.name = name;
            this.r = r;
            this.cir = 2 * r * Math.PI; // 둘레 계산
        }

        // 행성 정보를 출력하는 메서드
        public void print() {
            System.out.printf("행성 이름: %s, 반지름: %d km, 둘레: %.2f km%n", name, r, cir);
        }
    }
}
