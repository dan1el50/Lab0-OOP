package oop.practice.lab0;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader{

    public List<Individuals> readIndividualsFromFile(String filePath) {
        List<Individuals> listOfIndividuals = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objectMapper.readTree(new File(filePath));
            JsonNode dataNode = rootNode.path("data");

            for (JsonNode individualNode : dataNode) {
                int id = individualNode.get("id").asInt();
                Boolean isHumanoid = individualNode.has("isHumanoid") ? individualNode.get("isHumanoid").asBoolean() : false;
                String planet = individualNode.has("planet") ? individualNode.get("planet").asText() : "Unknown";
                Integer age = individualNode.has("age") ? individualNode.get("age").asInt() : 0;
                String[] traits = new String[individualNode.path("traits").size()];

                for (int i = 0; i < traits.length; i++) {
                    traits[i] = individualNode.path("traits").get(i).asText();
                }

                Individuals individual = new Individuals(id, isHumanoid, planet, age, traits);
                listOfIndividuals.add(individual);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfIndividuals;
    }

}