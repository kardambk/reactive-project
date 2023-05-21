package com.kardam.testproject.mapper;

import com.kardam.testproject.dto.Resource;
import com.kardam.testproject.dto.ResourceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MappingHelper {

    ResourceDTO resourceToResourceDTO(Resource resource);

    Resource resourceDTOToResource(ResourceDTO save);
}