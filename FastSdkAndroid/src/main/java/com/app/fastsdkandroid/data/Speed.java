package com.app.fastsdkandroid.data;

public class Speed {
    public final Client client;
    public final Target[] target;

    public Speed(Client client, Target[] target) {
        this.client = client;
        this.target = target;
    }
}
