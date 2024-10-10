package oop.practice;

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
                int id = individualNode.path("id").asInt();
                Boolean isHumanoid = individualNode.path("isHumanoid").isMissingNode() ? null : individualNode.path("isHumanoid").asBoolean();
                String planet = individualNode.path("planet").isMissingNode() ? null : individualNode.path("planet").asText();
                Integer age = individualNode.path("age").isMissingNode() ? null : individualNode.path("age").asInt();
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