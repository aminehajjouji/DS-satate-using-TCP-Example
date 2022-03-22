public class Context {
    private TcpState state;
    private static final Context context = new Context();
    private Context() {
        state=null;
    }

    public TcpState getState() {
        return state;
    }

    public void setState(TcpState state) {
        this.state = state;
    }
    public static Context getInstance(){
        return context;
    }
}
