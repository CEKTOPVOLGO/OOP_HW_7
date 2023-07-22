public class Complex implements Sum, Diff, Multiply{
    private NumComplex z1;
    private NumComplex z2;
    private int c;
    Complex(NumComplex z1, NumComplex z2, int c){
        this.z1 = z1;
        this.z2 = z2;
        this.c = c;
    }
    public void Parse(){
        switch (c){
            case 1:
                sum();
                break;
            case 2:
                diff();
                break;
            case 3:
                multiply();
                break;
            default:
                System.out.println("Такой операции не существует.");
        }
    }
    @Override
    public void diff() {
        int real = z1.getReal() - z2.getReal();
        int imaginary = z1.getImaginary() - z2.getImaginary();
        if (imaginary < 0){
            System.out.println("Результат разности z1  и z2 = " + real + " " + imaginary + " * i.");
        }
        else {
            System.out.println("Результат разности z1  и z2 = " + real + " + " + imaginary + " * i.");
        }
    }

    @Override
    public void multiply() {
        int real = z1.getReal() * z2.getReal();
        int imaginary = z1.getImaginary() * z2.getImaginary();
        if (imaginary < 0){
            System.out.println("Результат произведения z1  и z2 = " + real + " " + imaginary + " * i.");
        }
        else{
            System.out.println("Результат произведения z1  и z2 = " + real + " + " + imaginary + " * i.");
        }

    }
    @Override
    public void sum() {
        int real = z1.getReal() + z2.getReal();
        int imaginary = z1.getImaginary() + z2.getImaginary();
        if (imaginary < 0){
            System.out.println("Результат суммы z1  и z2 = " + real + " " + imaginary + " * i.");
        }
        else {
            System.out.println("Результат суммы z1  и z2 = " + real + " + " + imaginary + " * i.");
        }
    }
}
