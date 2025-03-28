package utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JSONFileReader {

	private JSONFileReader() {
	}

	static String jsonFilePath = null;

	public static HashMap<String, Object> getData() throws IOException {
		HashMap<String, Object> map = new ObjectMapper().readValue(new File(jsonFilePath),
				new TypeReference<HashMap<String, Object>>() {
				});

		return map;
	}
}
