package com.java.poc;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONParser {

    public static void main(String[] args) {
// Path to the JSON file
        String followers = "src/test/java/com/java/poc/followers.json";
        System.out.println("Followers : ");
        parseJson(followers);

        String following = "src/test/java/com/java/poc/following.json";
        System.out.println("Following : ");
        parseJson(following);

    }

    public static void parseJson(String filePath){
        try {
            // Read the file to a String
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Create a JSONArray
            JSONArray jsonArray = new JSONArray(content);

            // Initialize an empty string to hold the values
            StringBuilder values = new StringBuilder();

            // Loop through the array
            for (int i = 0; i < jsonArray.length(); i++) {
                // Get each JSONObject in the array
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                // Get the nested JSONArray
                JSONArray stringListData = jsonObject.getJSONArray("string_list_data");

                // Loop through the nested array
                for (int j = 0; j < stringListData.length(); j++) {
                    // Get each nested JSONObject
                    JSONObject obj = stringListData.getJSONObject(j);

                    // Get the value of the "value" key
                    String value = obj.getString("value");

                    // Add the value to the string, followed by a comma if it's not the last element
                    values.append(value);
                    if (i < jsonArray.length() - 1 || j < stringListData.length() - 1) {
                        values.append(", ");
                    }
                }
            }

            // Print the values
            System.out.println(values.toString());
            System.out.println("**********************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
