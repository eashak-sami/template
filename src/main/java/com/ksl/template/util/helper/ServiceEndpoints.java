package com.ksl.template.util.helper;

public interface ServiceEndpoints {
    interface Controllers {
        String SAMPLE_CONTROLLER = "/api/sample";
    }

    interface SampleController {
        String CREATE = "";
        String UPDATE = "/update";
        String GET = "/{id}";
    }
}
