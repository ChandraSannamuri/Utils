
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
    "ROW_NUMBER",
    "SLOTS_IN_ROW",
    "START_SLOT_NUMBER"
})
@Generated("jsonschema2pojo")
public class Value__1 {

    @JsonProperty("ROW_NUMBER")
    private RowNumber rowNumber;
    @JsonProperty("SLOTS_IN_ROW")
    private SlotsInRow slotsInRow;
    @JsonProperty("START_SLOT_NUMBER")
    private StartSlotNumber startSlotNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ROW_NUMBER")
    public RowNumber getRowNumber() {
        return rowNumber;
    }

    @JsonProperty("ROW_NUMBER")
    public void setRowNumber(RowNumber rowNumber) {
        this.rowNumber = rowNumber;
    }

    @JsonProperty("SLOTS_IN_ROW")
    public SlotsInRow getSlotsInRow() {
        return slotsInRow;
    }

    @JsonProperty("SLOTS_IN_ROW")
    public void setSlotsInRow(SlotsInRow slotsInRow) {
        this.slotsInRow = slotsInRow;
    }

    @JsonProperty("START_SLOT_NUMBER")
    public StartSlotNumber getStartSlotNumber() {
        return startSlotNumber;
    }

    @JsonProperty("START_SLOT_NUMBER")
    public void setStartSlotNumber(StartSlotNumber startSlotNumber) {
        this.startSlotNumber = startSlotNumber;
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
