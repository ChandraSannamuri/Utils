
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
    "WINDOW_TYPE",
    "SUPPORTS_SINGLE_FIBRE_WORKING",
    "SUPPORTS_DUAL_FIBRE_WORKING",
    "PORT_WAVELENGTHS"
})
@Generated("jsonschema2pojo")
public class Value__3 {

    @JsonProperty("WINDOW_TYPE")
    private WindowType windowType;
    @JsonProperty("SUPPORTS_SINGLE_FIBRE_WORKING")
    private SupportsSingleFibreWorking supportsSingleFibreWorking;
    @JsonProperty("SUPPORTS_DUAL_FIBRE_WORKING")
    private SupportsDualFibreWorking supportsDualFibreWorking;
    @JsonProperty("PORT_WAVELENGTHS")
    private PortWavelengths portWavelengths;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("WINDOW_TYPE")
    public WindowType getWindowType() {
        return windowType;
    }

    @JsonProperty("WINDOW_TYPE")
    public void setWindowType(WindowType windowType) {
        this.windowType = windowType;
    }

    @JsonProperty("SUPPORTS_SINGLE_FIBRE_WORKING")
    public SupportsSingleFibreWorking getSupportsSingleFibreWorking() {
        return supportsSingleFibreWorking;
    }

    @JsonProperty("SUPPORTS_SINGLE_FIBRE_WORKING")
    public void setSupportsSingleFibreWorking(SupportsSingleFibreWorking supportsSingleFibreWorking) {
        this.supportsSingleFibreWorking = supportsSingleFibreWorking;
    }

    @JsonProperty("SUPPORTS_DUAL_FIBRE_WORKING")
    public SupportsDualFibreWorking getSupportsDualFibreWorking() {
        return supportsDualFibreWorking;
    }

    @JsonProperty("SUPPORTS_DUAL_FIBRE_WORKING")
    public void setSupportsDualFibreWorking(SupportsDualFibreWorking supportsDualFibreWorking) {
        this.supportsDualFibreWorking = supportsDualFibreWorking;
    }

    @JsonProperty("PORT_WAVELENGTHS")
    public PortWavelengths getPortWavelengths() {
        return portWavelengths;
    }

    @JsonProperty("PORT_WAVELENGTHS")
    public void setPortWavelengths(PortWavelengths portWavelengths) {
        this.portWavelengths = portWavelengths;
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
