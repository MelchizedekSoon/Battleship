public class Temp {

    public enum Month {
        JAN(1),
        FEB(2),
        MAR(3),
        APR(4),
        MAY(5),
        JUN(6),
        JUL(7),
        AUG(8),
        SEP(9),
        OCT(10),
        NOV(11),
        DEC(12);

        Month(int number) {
            this.number = number;
        }

        private final int number;

        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println(Month.valueOf("JUN"));
        System.out.println(Month.JAN.getNumber());
    }
}
