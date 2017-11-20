/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dc.avalon_client.Definitions;

/**
 *
 * @author lucas
 */
public class DefaultDefinition implements iDefinition
{
    private String defaultValue; 
    
    public DefaultDefinition(String definition)
    {
        this.defaultValue = definition;
    }    
    
    public Object getDefinition()
    {
        return defaultValue;
    }
}
