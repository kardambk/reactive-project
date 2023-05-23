package com.kardam.testproject.api;

import com.kardam.testproject.dto.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ResourceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T11:59:04.101384600+05:30[Asia/Calcutta]")
public interface ResourceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /resource : create Resource
     *
     * @param resource  (optional)
     * @return OK (status code 200)
     * @see ResourceApi#createResource
     */
    default Mono<ResponseEntity<Resource>> createResource(Mono<Resource> resource,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"resourceType\" : \"resourceType\" }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * DELETE /resource/delete/{id} : Delete Resource By Id
     *
     * @param id Unique Id of a Resource (required)
     * @return OK (status code 200)
     * @see ResourceApi#deleteResourceById
     */
    default Mono<ResponseEntity<Void>> deleteResourceById(Integer id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

    /**
     * GET /resource/{id} : Get Resource By Id
     *
     * @param id Unique Id of a Resource (required)
     * @return OK (status code 200)
     * @see ResourceApi#getResourceById
     */
    default Mono<ResponseEntity<Resource>> getResourceById(Integer id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"resourceType\" : \"resourceType\" }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * PUT /resource/update : update Resource
     *
     * @param resource  (optional)
     * @return OK (status code 200)
     * @see ResourceApi#updateResource
     */
    default Mono<ResponseEntity<Resource>> updateResource(Mono<Resource> resource,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"resourceType\" : \"resourceType\" }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

}
