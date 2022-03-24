package org.sqli.solution2;

public class TcpConnect extends TcpState {

    public TcpConnect(TCPConnection connection) {
        super(connection);
    }

    public Boolean open() {
        connection.changeState(new TcpDisconnect(connection));
        return true;
    }


    public Boolean close() {
        throw new IllegalStateException();
    }

}
