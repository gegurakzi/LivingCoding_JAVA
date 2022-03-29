package lib.test;

public abstract class poly {
    int l, r;
    public poly(int _l, int _r){
        this.l = _l;
        this.r = _r;
    }
    abstract String sum(int l, int r);
    abstract String mul(int l, int r);

    public String run(){
        return "sum: "+this.sum(this.l, this.r)+", mul: "+this.mul(this.l, this.r);
    }
}
