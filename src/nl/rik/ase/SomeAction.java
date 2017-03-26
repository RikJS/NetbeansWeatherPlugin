/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rik.ase;

import java.awt.event.ActionEvent;
import java.awt.Component;
import java.io.IOException;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "nl.rik.ase.SomeAction"
)
@ActionRegistration(
        lazy = false,
        displayName = "NOT-USED"
)
@ActionReference(path = "Toolbars/File", position = 0)
public final class SomeAction extends AbstractAction implements Presenter.Toolbar {
    
    @Override
    public Component getToolbarPresenter() {
        return new NewJPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
