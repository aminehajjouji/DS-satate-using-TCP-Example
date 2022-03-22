public class TcpDisconnect extends TcpState{
    private Context context = Context.getInstance();

    public Boolean open() {
         throw new IllegalStateException();
    }

    public Boolean close() {
        System.out.println("tcDisconnect");
        context.setState(new TcpConnect());
        return false;
    }


}
