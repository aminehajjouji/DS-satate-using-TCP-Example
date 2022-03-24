package org.sqli.solution2;

public class TCPConnection {
    public static final boolean ON = true;
    public static final boolean OFF = false;
    private TcpState state;

    public TCPConnection() {
        state = new TcpConnect(this);
    }

    public void changeState(TcpState state) {
        this.state = state;
    }

    public boolean connect() {
        return state.open();

    }

    public boolean disconnect() {
        return state.close();

    }


}
