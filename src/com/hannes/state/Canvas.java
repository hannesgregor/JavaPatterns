package com.hannes.state;

public class Canvas {

    // Tänu uutele klassidele ja State patterni implementeerimisele ei pea me kirjutama seda pikka joru
    /*private ToolType currentTool;

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("Selection icon");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("Brush icon");
        else if (currentTool == ToolType.ERASER)
            System.out.println("Erasers icon");
    }
    public void mouseUp() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("Draw dash rectangle");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("Draw line");
        else if (currentTool == ToolType.ERASER)
            System.out.println("Erase something");
    }
    public ToolType getCurrentTool() {
        return currentTool;
    }
    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
    */

    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }
    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
