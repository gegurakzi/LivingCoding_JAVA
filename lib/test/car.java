package lib.test;

public abstract class car {
    protected abstract String engine();
    protected abstract String transmission();

    private String _engine = "none";
    private String _transmission = "none";
    public String get_engine() {
        return _engine;
    }
    public String get_transmission() {
        return _transmission;
    }
    protected void set_engine(String _engine) {
        this._engine = _engine;
    }
    protected void set_transmission(String _transmission) {
        this._transmission = _transmission;
    }
    protected car(){
        set_engine("no engine");
        set_transmission("no transmission");
    }
}
