/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JokerManager.Manager;

/**
 *
 * @author john
 */
public class Manager_AddQuantity_BT_Item_Listener implements ActionListener{
    Manager manager;

    public Manager_AddQuantity_BT_Item_Listener(Manager manager) {
        this.manager = manager;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String itemID = manager.getItmeID_TF_Item().getText();
        String quantity = manager.getQuantity_TF_Item().getText();
        
        
        
        //add the item data in the database 
        manager.showMsg("THE ITEM ADDED AND THE TABLE WAS UPDATED");
        //and update the Employee table
        
       

    
    }
    
}
