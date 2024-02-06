/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sparkprimer;

/**
 *
 * @author jose.correa-r
 */
public class MyWebServices {
    public static void main(String[] args) {
        HttpServer.get("/arep" , () -> "Hello Arep.");
        
        get("/hello", (req, res) -> {
            String msg = "<h1>Hello World</h1>";
            return msg ;
        });
            
    }
}
