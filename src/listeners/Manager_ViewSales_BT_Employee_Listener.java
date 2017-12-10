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
public class Manager_ViewSales_BT_Employee_Listener implements ActionListener{
    Manager manager;

    public Manager_ViewSales_BT_Employee_Listener(Manager manager) {
        this.manager = manager;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       int employeeId = Integer.parseInt(manager.getEmployeId_TF_Employee().getText());

        //validate the employe  number if in the Employee table in the database
        //diplay the emloyee sales in the shoping chart 
        
       
    
    }
    
}
