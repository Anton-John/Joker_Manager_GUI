/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JokerManager.Manager;
import JokerManager.WelcomePage;

/**
 *
 * @author john
 */
public class WelcomePage_Login_BT_Login_Listener implements ActionListener {

    WelcomePage welcomePage;
    Manager manager;

    public WelcomePage_Login_BT_Login_Listener(WelcomePage welcomePage) {
        this.welcomePage = welcomePage;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clerkName = welcomePage.getManagerName_TF_Login().getText();
        String password = welcomePage.getPassword_TF_Login().getText();

        int result = 1;
        //= auth.login(clerkName, password);
        // get the manager and pass it in the parameter of the manager 
        if (result == 1) {
            welcomePage.showMsg("LOGGED IN SUCCESSFULLY");

            manager = new Manager();

            manager.setLocationRelativeTo(null);
            welcomePage.dispose();
            manager.setVisible(true);
        } else {
            welcomePage.showMsg("WRONG USERNAME/PASSWORD");
        }

    }

}
