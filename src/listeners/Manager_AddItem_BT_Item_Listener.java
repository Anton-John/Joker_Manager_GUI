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
public class Manager_AddItem_BT_Item_Listener implements ActionListener {

    Manager manager;

    public Manager_AddItem_BT_Item_Listener(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = manager.getName_TF_Item().getText();
        String buyingPrice = manager.getBuyingPrice_TF_Item().getText();
        int price = Integer.parseInt(manager.getPrice_TF_Item().getText());
        int stock = Integer.parseInt(manager.getStock_TF_Item().getText());
        
        
        
        //add the item to database 
           manager.showMsg("THE ITEM WAS ADDED AND THE TABLE WAS UPDATED");
    }

}
