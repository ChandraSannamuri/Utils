
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
    "SALEABLE_ENTITY_CODE",
    "SALEABLE_ENTITY_DESCRIPTION",
    "CARD_WINDOW_TYPE"
})
@Generated("jsonschema2pojo")
public class Value {

    @JsonProperty("SALEABLE_ENTITY_CODE")
    private SaleableEntityCode saleableEntityCode;
    @JsonProperty("SALEABLE_ENTITY_DESCRIPTION")
    private SaleableEntityDescription saleableEntityDescription;
    @JsonProperty("CARD_WINDOW_TYPE")
    private CardWindowType cardWindowType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SALEABLE_ENTITY_CODE")
    public SaleableEntityCode getSaleableEntityCode() {
        return saleableEntityCode;
    }

    @JsonProperty("SALEABLE_ENTITY_CODE")
    public void setSaleableEntityCode(SaleableEntityCode saleableEntityCode) {
        this.saleableEntityCode = saleableEntityCode;
    }

    @JsonProperty("SALEABLE_ENTITY_DESCRIPTION")
    public SaleableEntityDescription getSaleableEntityDescription() {
        return saleableEntityDescription;
    }

    @JsonProperty("SALEABLE_ENTITY_DESCRIPTION")
    public void setSaleableEntityDescription(SaleableEntityDescription saleableEntityDescription) {
        this.saleableEntityDescription = saleableEntityDescription;
    }

    @JsonProperty("CARD_WINDOW_TYPE")
    public CardWindowType getCardWindowType() {
        return cardWindowType;
    }

    @JsonProperty("CARD_WINDOW_TYPE")
    public void setCardWindowType(CardWindowType cardWindowType) {
        this.cardWindowType = cardWindowType;
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
