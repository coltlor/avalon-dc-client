/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dc.avalon_client.IO;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class Reader
{
    private String file;
   
    public Reader(String file)
    {
        this.file = file;
    }
    
    public String[] getLine()
    {
        String[] line = null;
        
        try {
            CSVReader reader = new CSVReader(new FileReader(this.file));
            line = reader.readNext();
                                               
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return line;
    }
    
    public String getContent()
    {
        return "CONTENT";
    }
}
