package enthuware.FLowsAndExceptions.MyException;

    class E1 extends Exception {
    }
    class E21 extends E1 {
    }

    class E2 {
        public static void main(String[] args) {
            try {
                throw new E21();
            } catch (E1 e) {
                System.out.println("E1");
            } catch (Exception e) {
                System.out.println("E");
            } finally {
                System.out.println("Finally");
            }
        }
    }
