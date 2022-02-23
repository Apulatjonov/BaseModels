package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String status;
    private Integer code;
    private String data;

    private ResponseDTO(ResponseBuilder builder) {
        this.setStatus(builder.status);
        this.setCode(builder.code);
        this.setData(builder.data);
    }

    public static class ResponseBuilder {
        private String status;
        private Integer code;
        private String data;

        public ResponseBuilder() {
        }

        public ResponseBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public ResponseBuilder setCode(Integer code) {
            this.code = code;
            return this;
        }

        public ResponseBuilder setData(String data) {
            this.data = data;
            return this;
        }

        public ResponseDTO build() {
            return new ResponseDTO(this);
        }
    }

}
