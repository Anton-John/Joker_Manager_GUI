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
public class Manager_AddEmployee_BT_Employee_Listener implements ActionListener {

    Manager manager;

    public Manager_AddEmployee_BT_Employee_Listener(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = manager.getName_TF_Employee().getText();
        String userName = manager.getUserName_TF_Employee().getText();
        String password = manager.getPassword_TF_Employee().getText();

        //add the employee data in the database 
        manager.showMsg("THE EMPLOYEE ADDED AND THE TABLE WAS UPDATED");
        //and update the Employee table
      

    }

}
