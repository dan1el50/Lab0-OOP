package oop.practice.lab1.task3;

import oop.practice.lab1.task1.Display;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    public Assistant(String assistantName, List<Display> assignedDisplays) {
        this.assistantName = assistantName;
        this.assignedDisplays = assignedDisplays;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public List<Display> getAssignedDisplays() {
        return assignedDisplays;
    }

    public void assignDisplay(Display d){
        assignedDisplays.add(d);
    }

    public void assist(){
        for (int i = 0; i < assignedDisplays.size(); i++) {
            Display current = assignedDisplays.get(i);
            Display next = assignedDisplays.get((i + 1) % assignedDisplays.size());
            current.compareWithMonitor(next);
        }
    }

    public Display buyDisplay(Display d){
        assignedDisplays.remove(d);
        return d;
    }
}