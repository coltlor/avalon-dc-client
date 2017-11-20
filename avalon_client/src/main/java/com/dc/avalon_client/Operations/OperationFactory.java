/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dc.avalon_client.Operations;

import com.dc.avalon_client.Definitions.*;

/**
 *
 * @author lucas
 */
public class OperationFactory
{
    public static Operation create(String name, String type, String definition)
    {
        switch (type){
            case "Regex": 
                return new Regex(name, new RegexDefinition(definition));
            case "Default": 
                return new Default(name, new DefaultDefinition(definition));                
            case "Teste":
                throw new IllegalArgumentException("The Teste operations was not implemented");
            default:
                System.out.println("Teste");
                throw new IllegalArgumentException("Could not find the operation");
        } 
    }
}
