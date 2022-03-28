package lib.test;

public class C {
    int left, right;

    public C(){
        this.left = 1;
        this.right = 2;
    }
    public C(int _left, int _right){
        this.left = _left;
        this.right = _right;
    }

    public void print_left(){
        System.out.println(this.left);
    }
    public void print_right(){
        System.out.println(this.right);
    }
}
