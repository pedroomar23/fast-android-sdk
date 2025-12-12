package com.app.fastsdkandroid.data;

public class Client {
    public final String ip;
    public final String asn;
    public final Location location;

    public Client(String ip, String asn, Location location) {
        this.ip = ip;
        this.asn = asn;
        this.location = location;
    }
}
