/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dc.avalon_client.Operations;

import java.util.ArrayList;

/**
 *
 * @author lucas
 * Class used to store the operations defined by the user
 */
public class OperationsContainer 
{    
    private ArrayList<Operation> operations = new ArrayList();
    
    public void addOperation(Operation operation)
    {
        this.operations.add(operation);
    }
    
    public void build(String name, String type, String definition)
    {
        this.addOperation(
                OperationFactory.create(name, type, definition)
        );
    }
}
