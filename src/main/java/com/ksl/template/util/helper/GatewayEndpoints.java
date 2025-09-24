package com.ksl.template.util.helper;

public interface GatewayEndpoints {

    interface SampleRequestGateway {
        String GET_API_URL = "/api/project/{id}/get";
        String POST_API_URL = "/api/project/update";
        String DELETE_API_URL = "/api/project/{id}/delete";
    }
}
