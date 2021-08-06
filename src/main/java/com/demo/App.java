package com.demo;

import java.io.File;
import java.io.IOException;

import com.demo.vo.CardDetails;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		File jsonFile = new File("/Users/crsannamuri/eclipse/JSONTOCSV/resources/input.json");
		File csvFile = new File("Output.csv");
		JsonNode jsonTree = null;
		try {
			
//			CardDetails cardDetails= new ObjectMapper()
//				    .readValue(new File("/Users/crsannamuri/eclipse/JSONTOCSV/resources/input.json"), CardDetails.class);
//			CsvMapper csvMapper2 = new CsvMapper();
//			Builder csvSchemaBuilder2 = CsvSchema.builder();
//
//			CsvSchema csvSchema2 = csvSchemaBuilder2.build().withHeader();
//
//			csvMapper2.writerFor(CardDetails.class)
//		    .with(csvSchema2)
//		    .writeValue(new File("orderLinesReformated.csv"), cardDetails);
//			System.out.println(cardDetails);
			jsonTree = new ObjectMapper().readTree(jsonFile);

			Builder csvSchemaBuilder = CsvSchema.builder();
			JsonNode firstObject = jsonTree.elements().next();
			
			firstObject.fieldNames().forEachRemaining(fieldName -> {
				System.out.println("fieldName"+ fieldName);
				csvSchemaBuilder.addColumn(fieldName);
			});
			CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();

			CsvMapper csvMapper = new CsvMapper();
			csvMapper.enable(CsvParser.Feature.IGNORE_TRAILING_UNMAPPABLE);
			csvMapper.enable(JsonGenerator.Feature.IGNORE_UNKNOWN);
			
			csvMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);


			csvMapper.writerFor(JsonNode.class).with(csvSchema).writeValue(csvFile, jsonTree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//
		//
		//
		// JSONParser jsonparser=new JSONParser();
		// FileReader reader=new FileReader(".\\jsonfile\\Nokia_10G Optical Transceiver
		// SFP+_10GBase-LR_(N_A).json");
		// ObjectMapper objectMapper = new ObjectMapper();
		// CardDetails CardDetails= objectMapper.readValue(new
		// File("D:\\srims_workspace\\jsonProject\\jsonfile\\InputJson.json"),CardDetails.class);
		// System.out.println("CardDetails "+CardDetails);
		//
		//
		//
		// JSONObject valueListObj=(JSONObject)(jsonparser.parse(reader));
		// System.out.println("obj value :: "+valueListObj);
		//
		// System.out.println(" wayang-hardware-foam-card value :: "+
		// valueListObj.get("wayang-hardware-foam-card"));
		// System.out.println(" wayang-hardware-foam-card value :: "+
		// valueListObj.get("PORTS"));
		//
		// String fname = (String) valueListObj.get("OPTICAL_SPECIFICATIONS");
		// String lname = (String) valueListObj.get("valueList");
		// System.out.println(" name:"+fname);
	}

}

