package org.jsmpp.bean;

import org.jsmpp.extra.PendingResponse;

public interface PDUCallBack {
    <T extends Command> void listen(Long referenceId, PendingResponse<T> pendingResponse);
}
