package org.github.etcd.service.api;

import javax.ws.rs.WebApplicationException;

public class EtcdException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private EtcdError error;

    public EtcdException(WebApplicationException cause) {
        super(cause.getLocalizedMessage(), cause);
    }
    public EtcdException(Exception cause) {
        super(cause.getLocalizedMessage(), cause);
    }
    public EtcdException(WebApplicationException cause, EtcdError error) {
        super(cause.getLocalizedMessage(), cause);
        this.error = error;
    }

    public EtcdError getApiError() {
        return error;
    }
}
