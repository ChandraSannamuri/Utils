
package com.demo.vo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CARD_TYPE",
    "IS_ADVA",
    "IS_FOR_LIMS",
    "IS_BULK_CONNECTION_ENABLED",
    "HAS_TRANSMISSION_TYPE",
    "CARD_TRANSMISSION_TYPE",
    "DEFAULT_TRANSMISSION_TYPE",
    "DEFAULT_SUB_CARDS",
    "START_SLOT_LABEL"
})
public class CardPhysicalAttributes {

    @JsonProperty("CARD_TYPE")
    private CardType cardType;
    @JsonProperty("IS_ADVA")
    private IsAdva isAdva;
    @JsonProperty("IS_FOR_LIMS")
    private IsForLims isForLims;
    @JsonProperty("IS_BULK_CONNECTION_ENABLED")
    private IsBulkConnectionEnabled isBulkConnectionEnabled;
    @JsonProperty("HAS_TRANSMISSION_TYPE")
    private HasTransmissionType hasTransmissionType;
    @JsonProperty("CARD_TRANSMISSION_TYPE")
    private CardTransmissionType cardTransmissionType;
    @JsonProperty("DEFAULT_TRANSMISSION_TYPE")
    private DefaultTransmissionType defaultTransmissionType;
    @JsonProperty("DEFAULT_SUB_CARDS")
    private DefaultSubCards defaultSubCards;
    @JsonProperty("START_SLOT_LABEL")
    private StartSlotLabel startSlotLabel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CARD_TYPE")
    public CardType getCardType() {
        return cardType;
    }

    @JsonProperty("CARD_TYPE")
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("IS_ADVA")
    public IsAdva getIsAdva() {
        return isAdva;
    }

    @JsonProperty("IS_ADVA")
    public void setIsAdva(IsAdva isAdva) {
        this.isAdva = isAdva;
    }

    @JsonProperty("IS_FOR_LIMS")
    public IsForLims getIsForLims() {
        return isForLims;
    }

    @JsonProperty("IS_FOR_LIMS")
    public void setIsForLims(IsForLims isForLims) {
        this.isForLims = isForLims;
    }

    @JsonProperty("IS_BULK_CONNECTION_ENABLED")
    public IsBulkConnectionEnabled getIsBulkConnectionEnabled() {
        return isBulkConnectionEnabled;
    }

    @JsonProperty("IS_BULK_CONNECTION_ENABLED")
    public void setIsBulkConnectionEnabled(IsBulkConnectionEnabled isBulkConnectionEnabled) {
        this.isBulkConnectionEnabled = isBulkConnectionEnabled;
    }

    @JsonProperty("HAS_TRANSMISSION_TYPE")
    public HasTransmissionType getHasTransmissionType() {
        return hasTransmissionType;
    }

    @JsonProperty("HAS_TRANSMISSION_TYPE")
    public void setHasTransmissionType(HasTransmissionType hasTransmissionType) {
        this.hasTransmissionType = hasTransmissionType;
    }

    @JsonProperty("CARD_TRANSMISSION_TYPE")
    public CardTransmissionType getCardTransmissionType() {
        return cardTransmissionType;
    }

    @JsonProperty("CARD_TRANSMISSION_TYPE")
    public void setCardTransmissionType(CardTransmissionType cardTransmissionType) {
        this.cardTransmissionType = cardTransmissionType;
    }

    @JsonProperty("DEFAULT_TRANSMISSION_TYPE")
    public DefaultTransmissionType getDefaultTransmissionType() {
        return defaultTransmissionType;
    }

    @JsonProperty("DEFAULT_TRANSMISSION_TYPE")
    public void setDefaultTransmissionType(DefaultTransmissionType defaultTransmissionType) {
        this.defaultTransmissionType = defaultTransmissionType;
    }

    @JsonProperty("DEFAULT_SUB_CARDS")
    public DefaultSubCards getDefaultSubCards() {
        return defaultSubCards;
    }

    @JsonProperty("DEFAULT_SUB_CARDS")
    public void setDefaultSubCards(DefaultSubCards defaultSubCards) {
        this.defaultSubCards = defaultSubCards;
    }

    @JsonProperty("START_SLOT_LABEL")
    public StartSlotLabel getStartSlotLabel() {
        return startSlotLabel;
    }

    @JsonProperty("START_SLOT_LABEL")
    public void setStartSlotLabel(StartSlotLabel startSlotLabel) {
        this.startSlotLabel = startSlotLabel;
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
