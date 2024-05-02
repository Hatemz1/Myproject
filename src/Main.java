public class Main {
    public static void main(String[] args) {

        Shape s = new square();
        Shape r = new rectangle();
        Shape t = new triangle();
        Shape c = new circle();

        drawer d = new drawer();
        d.draw(s);
        d.draw(r);
        d.draw(t);
        d.draw(c);
    }
}