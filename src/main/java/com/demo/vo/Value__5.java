
package com.demo.vo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "COMPONENT_NAME",
    "MANUFACTURER",
    "MODEL",
    "VERSION"
})
@Generated("jsonschema2pojo")
public class Value__5 {

    @JsonProperty("COMPONENT_NAME")
    private ComponentName componentName;
    @JsonProperty("MANUFACTURER")
    private Manufacturer manufacturer;
    @JsonProperty("MODEL")
    private Model model;
    @JsonProperty("VERSION")
    private Version version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("COMPONENT_NAME")
    public ComponentName getComponentName() {
        return componentName;
    }

    @JsonProperty("COMPONENT_NAME")
    public void setComponentName(ComponentName componentName) {
        this.componentName = componentName;
    }

    @JsonProperty("MANUFACTURER")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("MANUFACTURER")
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("MODEL")
    public Model getModel() {
        return model;
    }

    @JsonProperty("MODEL")
    public void setModel(Model model) {
        this.model = model;
    }

    @JsonProperty("VERSION")
    public Version getVersion() {
        return version;
    }

    @JsonProperty("VERSION")
    public void setVersion(Version version) {
        this.version = version;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
