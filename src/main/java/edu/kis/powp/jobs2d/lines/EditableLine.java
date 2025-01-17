package edu.kis.powp.jobs2d.lines;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class EditableLine extends AbstractLine {
    public EditableLine() {
        this.color = Color.RED;
        this.thickness = 2.5F;
        this.dotted = false;
    }

    public EditableLine(Color color, float thickness, boolean dotted) {
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setThickness(float thickness){
        this.thickness = thickness;
    }

    public void setDotted(boolean dotted) {
        this.dotted = dotted;
    }
}