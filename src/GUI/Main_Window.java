/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JList;

/**
 *
 * @author Matthew
 */
public class Main_Window extends Window{
    
    private JButton NewBuyerAgent;
    private JButton NewSellerAgent;
    private JButton EditAgent;
    private JButton DeleteAgent;

    private JList BuyerAgentsList;
    private JList SellerAgentsList;
    
    public Main_Window(String tit, int width, int height)
	{
		super(tit, width, height);
		initiWidgets();
		setFrameOptions();
	}
    private void initiWidgets(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String args[])
	{
		new Main_Window("Agent Negotiations Simulator", 500, 500);
	}

    
}
