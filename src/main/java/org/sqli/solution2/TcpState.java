package org.sqli.solution2;

public abstract class TcpState {
    protected TCPConnection connection;

    public TcpState(TCPConnection connection) {
        this.connection = connection;
    }

    public abstract Boolean open();
    public abstract Boolean close();
}
