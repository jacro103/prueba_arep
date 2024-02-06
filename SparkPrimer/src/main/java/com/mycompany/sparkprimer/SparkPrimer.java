/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sparkprimer;
import static spark.Spark.get;
/**
 *
 * @author jose.correa-r
 */
public class SparkPrimer {

    public static void main(String[] args) {
        get("/hello", (req, res) -> {
            String msg = "<h1>Hello World</h1>";
            return msg ;
        });
            
    }
}
