/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer;

public class PrevCommand implements Command {
    
    private final ImageDisplay display;

    public PrevCommand(ImageDisplay display) {
        this.display = display;
    }

    @Override
    public void execute() {
        display.show(display.getCurrentImage().prev());
    }
    
}
