package lib.test;

public class polytwo extends poly {
    public polytwo(int _l, int _r){
        super(_l, _r);
    }

    @Override
    String sum(int l, int r) {
        return "(polytwo)" + Integer.toString(l + r);
    }

    @Override
    String mul(int l, int r) {
        return "(polytwo)" + Integer.toString(l * r);
    }
}
