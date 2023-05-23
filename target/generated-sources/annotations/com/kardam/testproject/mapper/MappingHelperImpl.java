package com.kardam.testproject.mapper;

import com.kardam.testproject.dto.Resource;
import com.kardam.testproject.dto.ResourceDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-23T11:59:13+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class MappingHelperImpl implements MappingHelper {

    @Override
    public ResourceDTO resourceToResourceDTO(Resource resource) {
        if ( resource == null ) {
            return null;
        }

        ResourceDTO resourceDTO = new ResourceDTO();

        resourceDTO.setId( resource.getId() );
        resourceDTO.setName( resource.getName() );
        resourceDTO.setResourceType( resource.getResourceType() );

        return resourceDTO;
    }

    @Override
    public Resource resourceDTOToResource(ResourceDTO save) {
        if ( save == null ) {
            return null;
        }

        Resource resource = new Resource();

        resource.setId( save.getId() );
        resource.setName( save.getName() );
        resource.setResourceType( save.getResourceType() );

        return resource;
    }
}
