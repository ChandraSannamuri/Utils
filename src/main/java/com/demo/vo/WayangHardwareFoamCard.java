
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
    "CARD_NAMING",
    "CARD_LOGICAL_ATTRIBUTES",
    "CARD_PHYSICAL_ATTRIBUTES",
    "CARD_PHYSICAL_LAYOUT",
    "PORTS",
    "includes-child-type"
})
@Generated("jsonschema2pojo")
public class WayangHardwareFoamCard {

    @JsonProperty("CARD_NAMING")
    private CardNaming cardNaming;
    @JsonProperty("CARD_LOGICAL_ATTRIBUTES")
    private CardLogicalAttributes cardLogicalAttributes;
    @JsonProperty("CARD_PHYSICAL_ATTRIBUTES")
    private CardPhysicalAttributes cardPhysicalAttributes;
    @JsonProperty("CARD_PHYSICAL_LAYOUT")
    private CardPhysicalLayout cardPhysicalLayout;
    @JsonProperty("PORTS")
    private Ports ports;
    @JsonProperty("includes-child-type")
    private IncludesChildType includesChildType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CARD_NAMING")
    public CardNaming getCardNaming() {
        return cardNaming;
    }

    @JsonProperty("CARD_NAMING")
    public void setCardNaming(CardNaming cardNaming) {
        this.cardNaming = cardNaming;
    }

    @JsonProperty("CARD_LOGICAL_ATTRIBUTES")
    public CardLogicalAttributes getCardLogicalAttributes() {
        return cardLogicalAttributes;
    }

    @JsonProperty("CARD_LOGICAL_ATTRIBUTES")
    public void setCardLogicalAttributes(CardLogicalAttributes cardLogicalAttributes) {
        this.cardLogicalAttributes = cardLogicalAttributes;
    }

    @JsonProperty("CARD_PHYSICAL_ATTRIBUTES")
    public CardPhysicalAttributes getCardPhysicalAttributes() {
        return cardPhysicalAttributes;
    }

    @JsonProperty("CARD_PHYSICAL_ATTRIBUTES")
    public void setCardPhysicalAttributes(CardPhysicalAttributes cardPhysicalAttributes) {
        this.cardPhysicalAttributes = cardPhysicalAttributes;
    }

    @JsonProperty("CARD_PHYSICAL_LAYOUT")
    public CardPhysicalLayout getCardPhysicalLayout() {
        return cardPhysicalLayout;
    }

    @JsonProperty("CARD_PHYSICAL_LAYOUT")
    public void setCardPhysicalLayout(CardPhysicalLayout cardPhysicalLayout) {
        this.cardPhysicalLayout = cardPhysicalLayout;
    }

    @JsonProperty("PORTS")
    public Ports getPorts() {
        return ports;
    }

    @JsonProperty("PORTS")
    public void setPorts(Ports ports) {
        this.ports = ports;
    }

    @JsonProperty("includes-child-type")
    public IncludesChildType getIncludesChildType() {
        return includesChildType;
    }

    @JsonProperty("includes-child-type")
    public void setIncludesChildType(IncludesChildType includesChildType) {
        this.includesChildType = includesChildType;
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
