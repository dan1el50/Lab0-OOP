package oop.practice.lab0;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class View {
    private ObjectMapper objectMapper;

    public View() {
        this.objectMapper = new ObjectMapper();
    }

    public void writeOutput(String universe, List<Individuals> individual) {
        try {
            File directory = new File("output");
            if (!directory.exists()) {
                directory.mkdir(); // Create output directory if it doesn't exist
            }
            FileWriter fileWriter = new FileWriter("output/" + universe + ".json");
            objectMapper.writeValue(fileWriter, individual);
            System.out.println("Json file for " + universe + " has been written and contains " + individual.size() + " individuals.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
