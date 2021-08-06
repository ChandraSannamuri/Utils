
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
    "CARD_MANUFACTURER",
    "CARD_NAME",
    "CARD_MODEL",
    "CARD_VERSION"
})
public class CardNaming {

    @JsonProperty("CARD_MANUFACTURER")
    private CardManufacturer cardManufacturer;
    @JsonProperty("CARD_NAME")
    private CardName cardName;
    @JsonProperty("CARD_MODEL")
    private CardModel cardModel;
    @JsonProperty("CARD_VERSION")
    private CardVersion cardVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CARD_MANUFACTURER")
    public CardManufacturer getCardManufacturer() {
        return cardManufacturer;
    }

    @JsonProperty("CARD_MANUFACTURER")
    public void setCardManufacturer(CardManufacturer cardManufacturer) {
        this.cardManufacturer = cardManufacturer;
    }

    @JsonProperty("CARD_NAME")
    public CardName getCardName() {
        return cardName;
    }

    @JsonProperty("CARD_NAME")
    public void setCardName(CardName cardName) {
        this.cardName = cardName;
    }

    @JsonProperty("CARD_MODEL")
    public CardModel getCardModel() {
        return cardModel;
    }

    @JsonProperty("CARD_MODEL")
    public void setCardModel(CardModel cardModel) {
        this.cardModel = cardModel;
    }

    @JsonProperty("CARD_VERSION")
    public CardVersion getCardVersion() {
        return cardVersion;
    }

    @JsonProperty("CARD_VERSION")
    public void setCardVersion(CardVersion cardVersion) {
        this.cardVersion = cardVersion;
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
