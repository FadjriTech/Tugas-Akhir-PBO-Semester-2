/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;
import model.Session;

public class SessionManager {
    private String username;
    private String password;
    private String role;

    public void saveSession(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Session getSession() {
        Session session = new Session();
        session.setUsername(username);
        session.setPassword(password);
        session.setRole(role);
        return session;
    }
}
