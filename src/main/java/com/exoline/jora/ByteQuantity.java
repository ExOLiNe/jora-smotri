package com.exoline.jora;

public class ByteQuantity {
    private short _byte;
    private int quantity;

    public ByteQuantity(short _byte, int quantity) {
        this._byte = _byte;
        this.quantity = quantity;
    }

    public short getByte() {
        return _byte;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setByte(short _byte) {
        this._byte = _byte;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
