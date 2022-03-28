package lib.test;

public class CC extends C {
    int top, bottom;
    public CC(){
        super();
        this.top = 3;
        this.bottom = 4;
    }
    public CC(int l, int r){
        super(l, r);
    }
    public CC(int l, int r, int t, int b){
        this(l, r);
        this.top = t;
        this.bottom = b;
    }

    @Override
    public void print_left() {
        super.print_left();
    }

    public void print_top(){
        System.out.println(this.top);
    }
    public void print_bottom(){
        System.out.println(this.bottom);
    }

}