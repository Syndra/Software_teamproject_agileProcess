//RLmerge_buton_actionlistener

package button_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import button_model.RLmerge_button;
import data_model.GUI_data_model;
public class RLmerge_button_actionlistener implements ActionListener{
	private GUI_data_model gui_data_model;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Get source of event and Typecast to Merge_button
		RLmerge_button rl_merge_button = (RLmerge_button)e.getSource();
		this.gui_data_model = rl_merge_button.getGui_data_model();
		
		//after clicked refresh_button, merge_button is executed.
		
		if(gui_data_model.getRefresh_status())
			rl_merge_button.merge(gui_data_model.getRight_text_area(),gui_data_model.getLeft_text_area());
		else
			 JOptionPane.showMessageDialog(null,"You can click Merge button,\nafter click Refresh Button!", "Error message", JOptionPane.WARNING_MESSAGE);

	}
}