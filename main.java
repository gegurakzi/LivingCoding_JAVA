import lib.test.*;

final class Volvo extends car{
    Volvo(){
        super();
    }
    public String engine(){
        set_engine("V8 600cc");
        return "engine adjusted!";
    }
    public String transmission(){
        set_transmission("12lv retarder");
        return "transmission adjusted!";
    }
}

public class main {

    public static void exec(poly res){
        System.out.println(res.run());
    }

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

        Volvo truck = new Volvo();
        System.out.println(truck.engine());
        System.out.println(truck.transmission());
        System.out.println(truck.get_engine());
        System.out.println(truck.get_transmission());

        poly one = new polyone(10, 31);
        poly two = new polytwo(4, 27);

        exec(one);
        exec(two);
    }
}
