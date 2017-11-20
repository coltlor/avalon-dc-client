/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dc.avalon_client.FileHandler;

import java.io.File;

/**
 *
 * @author lucas
 */
public class Archive 
{
    private String id;
    private File file;
    private Header header;
    
    public Archive(String id)
    {
        if(id.isEmpty()){
            throw new IllegalArgumentException("The ID can not be empty");
        }
        
        this.id = id;
    }
  
    public String getId() 
    {
        return id;
    }
    
    public void setHeader(Header header)
    {
        this.header = header;
    }
    
    
}
