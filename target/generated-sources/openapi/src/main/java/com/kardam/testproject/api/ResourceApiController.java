package com.kardam.testproject.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T11:59:04.101384600+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.resource.base-path:/api}")
public class ResourceApiController implements ResourceApi {

    private final ResourceApiDelegate delegate;

    public ResourceApiController(@Autowired(required = false) ResourceApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ResourceApiDelegate() {});
    }

    @Override
    public ResourceApiDelegate getDelegate() {
        return delegate;
    }

}
