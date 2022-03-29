package lib.test;

public class polyone extends poly{
    public polyone(int _l, int _r){
        super(_l, _r);
    }

    @Override
    String sum(int l, int r) {
        return "(polyone)"+Integer.toString(l + r);
    }
    @Override
    String mul(int l, int r) {
        return "(polyone)"+Integer.toString(l * r);
    }
}
