package com.team3130.vision3130.comm.messages;

public class HeartbeatMessage extends VisionMessage {

    static HeartbeatMessage sInst = null;

    public static HeartbeatMessage getInstance() {
        if (sInst == null) {
            sInst = new HeartbeatMessage();
        }
        return sInst;
    }

    @Override
    public String getType() {
        return "heartbeat";
    }

    @Override
    public String getMessage() {
        return "{}";
    }
}
