package com.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;
import com.demo.vo.CardDetails;
import com.demo.vo.Value__2;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class JsonToCSV {

	public static void main(String[] args) {
		// String jsonString = "{\"infile\": [{\"field1\": 11,\"field2\": 12,\"field3\":
		// 13},{\"field1\": 21,\"field2\": 22,\"field3\": 23},{\"field1\":
		// 31,\"field2\": 32,\"field3\": 33}]}";
		String jsonString;
		try {
			
			CardDetails cardDetails= new ObjectMapper()
			    .readValue(new File("/Users/crsannamuri/eclipse/JSONTOCSV/resources/input.json"), CardDetails.class);
			List<Value__2>  values=   cardDetails.getWayangHardwareFoamCard().getPorts().getPortAttributes().getValueList();
			
			Value__2[] valArray = values.stream().toArray(Value__2[]::new);
			CsvMapper csvMapper2 = new CsvMapper();
			csvMapper2.enable(CsvParser.Feature.IGNORE_TRAILING_UNMAPPABLE);
			csvMapper2.enable(JsonGenerator.Feature.IGNORE_UNKNOWN);
			
			csvMapper2.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder csvSchemaBuilder2 = CsvSchema.builder();

		CsvSchema csvSchema2 = csvSchemaBuilder2.build();

			csvMapper2.writerFor(Value__2[].class)
		    .with(csvSchema2)
		    .writeValue(new File("orderLinesReformated2.csv"),valArray );
			
			
			
			JsonNode jsonTree = new ObjectMapper().readTree(new File("/Users/crsannamuri/eclipse/JSONTOCSV/resources/input.json"));
			
			Builder csvSchemaBuilder = CsvSchema.builder();
			JsonNode PORT_ATTRIBUTES = jsonTree.findPath("PORT_ATTRIBUTES");
			JsonNode valueList = jsonTree.findPath("valueList");
			System.out.println(valueList);
//			JsonNode firstObject = jsonTree.elements().next();
//			valueList.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
			
			JsonNode firstObject = valueList.elements().next();
			firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
			
		
			
			CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();
			System.out.println("csvSchema"+csvSchema);
			CsvMapper csvMapper = new CsvMapper();
			csvMapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);
			csvMapper.writerFor(JsonNode.class)
			  .with(csvSchema)
			  .writeValue(new File("/Users/crsannamuri/eclipse/JSONTOCSV/resources/output.csv"), valueList);
			
			
			jsonString = new String(
					Files.readAllBytes(Paths.get("/Users/crsannamuri/eclipse/JSONTOCSV/resources/input.json")));

			JSONObject output;
			output = new JSONObject(jsonString);
			//System.out.println("jsonString"+output);
			;
			JSONObject jsonObj = output.getJSONObject("wayang-hardware-foam-card");
			JSONObject jsonObj2 = jsonObj.getJSONObject("PORTS");
			
			
			JSONObject JSONObject3 = jsonObj2.getJSONObject("PORT_ATTRIBUTES");
			System.out.println(JSONObject3);
			JSONArray docs  = JSONObject3.getJSONArray("valueList");

			File file = new File("/tmp2/fromJSON.csv");
			String csv = CDL.toString(docs);
			Files.writeString(Paths.get("/Users/crsannamuri/eclipse/JSONTOCSV/resources/fromJSON.csv"), csv);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
