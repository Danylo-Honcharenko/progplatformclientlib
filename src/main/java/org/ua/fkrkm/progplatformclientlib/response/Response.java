package org.ua.fkrkm.progplatformclientlib.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class Response<T> {
    private int status;
    private T data;

    public Response(HttpStatus status, T data) {
        this.status = status.value();
        this.data = data;
    }
}
