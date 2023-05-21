package com.kardam.testproject.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.NotNull;

@Entity
public class ResourceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String resourceType;

    public ResourceDTO() {
    }

    public ResourceDTO id(Integer id) {
        this.id = id;
        return this;
    }

    @Schema(
        name = "id",
        required = true
    )
    public @NotNull Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ResourceDTO name(String name) {
        this.name = name;
        return this;
    }

    @Schema(
        name = "name",
        required = false
    )
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceDTO resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    @Schema(
        name = "resourceType",
        required = false
    )
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ResourceDTO resource = (ResourceDTO) o;
            return Objects.equals(this.id, resource.id) && Objects.equals(this.name, resource.name) && Objects.equals(this.resourceType, resource.resourceType);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.resourceType});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDTO {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    resourceType: ").append(this.toIndentedString(this.resourceType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
