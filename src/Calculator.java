public class Calculator {
    int a;
    char oper;
    int b;


    public Calculator(int a, char oper, int b) {
        this.a = a;
        this.b = b;
        this.oper = oper;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public char getOper() {
        return oper;
    }

    public void setOper(char oper) {
        this.oper = oper;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int calculate (int a, char oper, int b) {
        int result = 0;
        switch (oper) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

        return result;
    }

}
