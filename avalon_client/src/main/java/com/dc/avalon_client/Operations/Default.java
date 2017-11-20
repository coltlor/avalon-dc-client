/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dc.avalon_client.Operations;

import com.dc.avalon_client.Definitions.iDefinition;

/**
 *
 * @author lucas
 */
public class Default extends Operation implements iOperation
{

    public Default(String name, iDefinition definition)
    {
        super(name, definition);
    }
    
    @Override
    public void execute()
    {
        
    }
}
