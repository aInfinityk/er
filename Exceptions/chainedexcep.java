import java.io.IOException;

class chainedexcep {
    public static void main(String[] args) throws Throwable {
        try {
            throw new ArithmeticException("Exception.").initCause(new IOException("IO cause."));
        } catch (ArithmeticException ae) {
            System.out.println("Caught : " + ae);
            System.out.println("Actual cause: " + ae.getCause());
        }
    }
}