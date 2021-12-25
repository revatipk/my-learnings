package enthuware;

public class ForSwitch {
    public static void main(String[] args) {
        int i = 5;
        switch (i) {
            default:
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                char c;
                LOOP:
                for (c = 0; c < 5; c++) {
                    switch (c++) {
                        case '0':
                            System.out.print("A");
                        case 1:
                            System.out.print("B");
                            break LOOP;
                        case 2:
                            System.out.print("C");
                            break;
                        case 3:
                            System.out.print("D");
                            break;
                        case 4:
                            System.out.print("E");
                        case 5:
                            System.out.print("F");
                    }
                }
        }
    }

    public void switchTest(byte x) {
        switch (x) {
            case 'b':   // 1
            default:   // 2
            case -2:    // 3
            case 80:    // 4
        }
    }
}
