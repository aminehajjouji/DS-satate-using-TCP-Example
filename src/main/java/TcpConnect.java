public class TcpConnect extends TcpState{
    private Context context = Context.getInstance();

    public Boolean open() {
        System.out.println("tcpConnect");
        context.setState(new TcpDisconnect());
         return true;
    }


    public Boolean close() {
        throw new IllegalStateException();
    }

}
