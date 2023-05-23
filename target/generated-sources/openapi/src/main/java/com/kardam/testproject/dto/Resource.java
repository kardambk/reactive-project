package com.kardam.testproject.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Resource POJO
 */

@Schema(name = "Resource", description = "Resource POJO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T11:59:04.101384600+05:30[Asia/Calcutta]")
public class Resource  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("resourceType")
  private String resourceType;

  public Resource id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Resource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Resource resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  
  @Schema(name = "resourceType", required = false)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.id, resource.id) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.resourceType, resource.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

