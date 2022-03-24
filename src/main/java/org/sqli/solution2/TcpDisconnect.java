package org.sqli.solution2;

public class TcpDisconnect extends TcpState {

    public TcpDisconnect(TCPConnection connection) {
        super(connection);
    }

    public Boolean open() {
         throw new IllegalStateException();
    }

    public Boolean close() {
      connection.changeState(new TcpConnect(connection));
        return false;
    }


}
