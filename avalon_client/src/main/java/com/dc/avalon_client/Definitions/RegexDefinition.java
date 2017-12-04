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
public class RegexDefinition implements iDefinition
{
    private String regex;
    
    public RegexDefinition(String definition)
    {
        this.regex = definition;
    }
    
    @Override
    public Object getDefinition()
    {
        return regex;
    }
}
