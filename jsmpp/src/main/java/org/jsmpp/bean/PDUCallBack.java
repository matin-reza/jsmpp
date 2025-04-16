package org.jsmpp.bean;

public interface PDUCallBack {
    void listen(Long referenceId, String recipientId);
}
