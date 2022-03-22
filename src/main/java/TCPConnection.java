public class TCPConnection implements TcpInterface{
     static  boolean ON = true;
     static boolean OFF = false;
    private Context context = Context.getInstance() ;

    public TCPConnection() {
        context.setState(new TcpConnect());
    }

    @Override
    public boolean connect() {
       return  context.getState().open();

    }

    @Override
    public boolean disconnect() {
        return context.getState().close();

    }
}
