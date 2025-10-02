package com.ksl.template.util.helper;

public interface ServiceEndpoints {
    interface Controllers {
        String SAMPLE_CONTROLLER = "/api/sample";
    }

    interface SampleController {
        String CREATE = "/create";
        String UPDATE = "/update/{id}";
        String GET = "/details/{id}";
        String DELETE = "/delete/{id}";
        String SEARCH = "/search";
    }
}
