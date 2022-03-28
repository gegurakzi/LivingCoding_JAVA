import lib.test.CC;

public class main {
    public static void main(String[] args){
        CC c1 = new CC();
        CC c2 = new CC(5, 6, 7, 8);
        c1.print_left();
        c1.print_right();
        c1.print_top();
        c1.print_bottom();
        c2.print_left();
        c2.print_right();
        c2.print_top();
        c2.print_bottom();
    }
}
