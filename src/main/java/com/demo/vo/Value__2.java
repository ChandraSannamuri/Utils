
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
    "NUMBER_OF_PORTS",
    "SIGNAL_SWITCHABLE",
    "POTENTIAL_SIGNAL_TYPES",
    "DEFAULT_SIGNAL_TYPE",
    "PORT_DIRECTION",
    "IGNORE_CONNECTIVITY_METADATA",
    "TRANSMISSION_MEDIA",
    "PORT_PROTECTION_TYPES",
    "PORT_CONNECTOR_TYPE",
    "PORT_DEFAULT_CONNECTOR_TYPE",
    "OPTICAL_SPECIFICATIONS"
})
@Generated("jsonschema2pojo")
public class Value__2 {

    @JsonProperty("NUMBER_OF_PORTS")
    private NumberOfPorts numberOfPorts;
    @JsonProperty("SIGNAL_SWITCHABLE")
    private SignalSwitchable signalSwitchable;
    @JsonProperty("POTENTIAL_SIGNAL_TYPES")
    private PotentialSignalTypes potentialSignalTypes;
    @JsonProperty("DEFAULT_SIGNAL_TYPE")
    private DefaultSignalType defaultSignalType;
    @JsonProperty("PORT_DIRECTION")
    private PortDirection portDirection;
    @JsonProperty("IGNORE_CONNECTIVITY_METADATA")
    private IgnoreConnectivityMetadata ignoreConnectivityMetadata;
    @JsonProperty("TRANSMISSION_MEDIA")
    private TransmissionMedia transmissionMedia;
    @JsonProperty("PORT_PROTECTION_TYPES")
    private PortProtectionTypes portProtectionTypes;
    @JsonProperty("PORT_CONNECTOR_TYPE")
    private PortConnectorType portConnectorType;
    @JsonProperty("PORT_DEFAULT_CONNECTOR_TYPE")
    private PortDefaultConnectorType portDefaultConnectorType;
    @JsonProperty("OPTICAL_SPECIFICATIONS")
    private OpticalSpecifications opticalSpecifications;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NUMBER_OF_PORTS")
    public NumberOfPorts getNumberOfPorts() {
        return numberOfPorts;
    }

    @JsonProperty("NUMBER_OF_PORTS")
    public void setNumberOfPorts(NumberOfPorts numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    @JsonProperty("SIGNAL_SWITCHABLE")
    public SignalSwitchable getSignalSwitchable() {
        return signalSwitchable;
    }

    @JsonProperty("SIGNAL_SWITCHABLE")
    public void setSignalSwitchable(SignalSwitchable signalSwitchable) {
        this.signalSwitchable = signalSwitchable;
    }

    @JsonProperty("POTENTIAL_SIGNAL_TYPES")
    public PotentialSignalTypes getPotentialSignalTypes() {
        return potentialSignalTypes;
    }

    @JsonProperty("POTENTIAL_SIGNAL_TYPES")
    public void setPotentialSignalTypes(PotentialSignalTypes potentialSignalTypes) {
        this.potentialSignalTypes = potentialSignalTypes;
    }

    @JsonProperty("DEFAULT_SIGNAL_TYPE")
    public DefaultSignalType getDefaultSignalType() {
        return defaultSignalType;
    }

    @JsonProperty("DEFAULT_SIGNAL_TYPE")
    public void setDefaultSignalType(DefaultSignalType defaultSignalType) {
        this.defaultSignalType = defaultSignalType;
    }

    @JsonProperty("PORT_DIRECTION")
    public PortDirection getPortDirection() {
        return portDirection;
    }

    @JsonProperty("PORT_DIRECTION")
    public void setPortDirection(PortDirection portDirection) {
        this.portDirection = portDirection;
    }

    @JsonProperty("IGNORE_CONNECTIVITY_METADATA")
    public IgnoreConnectivityMetadata getIgnoreConnectivityMetadata() {
        return ignoreConnectivityMetadata;
    }

    @JsonProperty("IGNORE_CONNECTIVITY_METADATA")
    public void setIgnoreConnectivityMetadata(IgnoreConnectivityMetadata ignoreConnectivityMetadata) {
        this.ignoreConnectivityMetadata = ignoreConnectivityMetadata;
    }

    @JsonProperty("TRANSMISSION_MEDIA")
    public TransmissionMedia getTransmissionMedia() {
        return transmissionMedia;
    }

    @JsonProperty("TRANSMISSION_MEDIA")
    public void setTransmissionMedia(TransmissionMedia transmissionMedia) {
        this.transmissionMedia = transmissionMedia;
    }

    @JsonProperty("PORT_PROTECTION_TYPES")
    public PortProtectionTypes getPortProtectionTypes() {
        return portProtectionTypes;
    }

    @JsonProperty("PORT_PROTECTION_TYPES")
    public void setPortProtectionTypes(PortProtectionTypes portProtectionTypes) {
        this.portProtectionTypes = portProtectionTypes;
    }

    @JsonProperty("PORT_CONNECTOR_TYPE")
    public PortConnectorType getPortConnectorType() {
        return portConnectorType;
    }

    @JsonProperty("PORT_CONNECTOR_TYPE")
    public void setPortConnectorType(PortConnectorType portConnectorType) {
        this.portConnectorType = portConnectorType;
    }

    @JsonProperty("PORT_DEFAULT_CONNECTOR_TYPE")
    public PortDefaultConnectorType getPortDefaultConnectorType() {
        return portDefaultConnectorType;
    }

    @JsonProperty("PORT_DEFAULT_CONNECTOR_TYPE")
    public void setPortDefaultConnectorType(PortDefaultConnectorType portDefaultConnectorType) {
        this.portDefaultConnectorType = portDefaultConnectorType;
    }

    @JsonProperty("OPTICAL_SPECIFICATIONS")
    public OpticalSpecifications getOpticalSpecifications() {
        return opticalSpecifications;
    }

    @JsonProperty("OPTICAL_SPECIFICATIONS")
    public void setOpticalSpecifications(OpticalSpecifications opticalSpecifications) {
        this.opticalSpecifications = opticalSpecifications;
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
