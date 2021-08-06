package com.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.demo.vo.CardDetails;
import com.demo.vo.Leaf__2;
import com.demo.vo.Leaf__3;
import com.demo.vo.Leaf__4;
import com.demo.vo.Value__2;
import com.demo.vo.Value__3;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoCSVNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper objectMapper = new ObjectMapper();
		CSVPrinter csvPrinter = null;
		FileWriter fileWriter = null;
		CSVFormat csvFormat = CSVFormat.DEFAULT.withRecordSeparator("\n");
		final Object[] CSV_FILE_HEADERS = { "NUMBER_OF_PORTS", "SIGNAL_SWITCHABLE", "POTENTIAL_SIGNAL_TYPES",
				"DEFAULT_SIGNAL_TYPE", "PORT_DIRECTION", "IGNORE_CONNECTIVITY_METADATA", "TRANSMISSION_MEDIA",
				"PORT_PROTECTION_TYPES", "PORT_CONNECTOR_TYPE", "PORT_DEFAULT_CONNECTOR_TYPE", "OPTICAL_SPECIFICATIONS",
				"urn:bt-common:modify_state", "OPERATION(ADD/UPDATE/DELETE)" };
		try {
			fileWriter = new FileWriter("export5.csv");
			csvPrinter = new CSVPrinter(fileWriter, csvFormat);
			csvPrinter.printRecord(CSV_FILE_HEADERS);
			CardDetails cardDetails = new ObjectMapper().readValue(
					new File("/Users/crsannamuri/eclipse/JSONTOCSV/resources/input.json"), CardDetails.class);
			List<Value__2> values = cardDetails.getWayangHardwareFoamCard().getPorts().getPortAttributes()
					.getValueList();
			for (Value__2 csvObject : values) {
				List<Leaf__2> leafList = csvObject.getPotentialSignalTypes().getLeafList();
				List<String> names = leafList.stream().map(Leaf__2::getValue).collect(Collectors.toList());
				List<String> data = Arrays.asList(csvObject.getNumberOfPorts().getValue(),
						String.valueOf(objectMapper.writeValueAsString(csvObject.getSignalSwitchable().getValue())),
						String.valueOf(names), csvObject.getDefaultSignalType().getValue(),
						csvObject.getPortDirection().getValue(), csvObject.getIgnoreConnectivityMetadata().getValue(),
						csvObject.getTransmissionMedia().getValue(),
						String.valueOf(csvObject.getPortProtectionTypes()
								.getLeafList().stream().map(Leaf__3::getValue).collect(Collectors.toList()
										)
								),
						String.valueOf(csvObject.getPortConnectorType().getLeafList().stream().map(Leaf__4::getValue).collect(Collectors.toList())),
						csvObject.getPortDefaultConnectorType().getValue(),
						String.valueOf(objectMapper.writeValueAsString(csvObject.getOpticalSpecifications().getValueList()))
						);
				csvPrinter.printRecord(data);
			}
		} catch (Exception e) {
			System.out.println("CSV writing error");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
				csvPrinter.close();
			} catch (IOException e) {
				System.out.println("closing error");
				e.printStackTrace();
			}
		}
	}

}
