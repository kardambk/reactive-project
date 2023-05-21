package com.kardam.testproject.service;

import com.kardam.testproject.api.ResourceApiDelegate;
import com.kardam.testproject.constants.Message;
import com.kardam.testproject.dao.ResourceRepository;
import com.kardam.testproject.dto.Resource;
import com.kardam.testproject.dto.ResourceDTO;
import com.kardam.testproject.exception.NotFoundException;
import com.kardam.testproject.mapper.MappingHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class ResourceServiceImpl implements ResourceApiDelegate {

    @Autowired
    private ResourceRepository resourceRepo;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ResourceApiDelegate.super.getRequest();
    }

    @Autowired
    private MappingHelper mapper;

    @Override
    public Mono<ResponseEntity<Resource>> createResource(Mono<Resource> resource, ServerWebExchange exchange) {
        return resource.flatMap(r -> {
                    ResourceDTO resourceDTO = mapper.resourceToResourceDTO(r);
                    return Mono.just(ResponseEntity.ofNullable(mapper.resourceDTOToResource(resourceRepo.save(resourceDTO))));
                });
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteResourceById(Integer id, ServerWebExchange exchange) {
        resourceRepo.deleteById(id);
        return Mono.just(ResponseEntity.ok().build());
    }

    @Override
    public Mono<ResponseEntity<Resource>> getResourceById(Integer id, ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ofNullable(mapper.resourceDTOToResource(resourceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException(Message.NOT_FOUND)))));
    }

    @Override
    public Mono<ResponseEntity<Resource>> updateResource(Mono<Resource> resource, ServerWebExchange exchange) {
        return resource.flatMap(r -> {
            ResourceDTO resourceDTO = mapper.resourceToResourceDTO(r);
            return Mono.just(ResponseEntity.ofNullable(mapper.resourceDTOToResource(resourceRepo.save(resourceDTO))));
        });
    }
}
