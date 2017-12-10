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
public class Manager_Search_BT_Item_Listener implements ActionListener {

    Manager manager;

    public Manager_Search_BT_Item_Listener(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Search = manager.getSearchItem_TF_Itme().getText();
        // logic functio call
        //Update the table with the itme based on the search
        manager.showMsg("THE TABLE WAS UPDATED");

    }

}
