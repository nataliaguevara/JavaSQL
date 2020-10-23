/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;

/**
 *
 * @author sara.guevara
 */
public class TestConexion {
     public static void main(String[] args) {
         try {
             Connection con = Conexion.getConexion();
             System.out.println(Conexion.getConexion().isClosed()); 
         } catch (Exception e) {
             e.printStackTrace();
         }
         
    }
}
