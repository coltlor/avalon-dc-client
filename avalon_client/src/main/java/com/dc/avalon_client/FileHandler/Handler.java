/*
 * The MIT License
 *
 * Copyright 2017 lucas.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.dc.avalon_client.FileHandler;

import com.dc.avalon_client.IO.Reader;

/**
 *
 * @author lucas
 */
public class Handler
{
    private String filePath;
    private Archive archive;
    
    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }
    
    public void load() throws Exception
    {
        if (this.filePath.isEmpty()){
            throw new Exception("The file path can not be empty");
        }
    }
    
    public void setArchive(Archive archive)
    {
        this.archive = archive;
    }
    
    public Header getHeader(Reader reader)
    {
        String[] fieldNameList = reader.getLine();;

        Header header = new Header();

        for (String fieldName : fieldNameList) {
            System.out.println(fieldName);
            header.addField(fieldName, new Field(fieldName));
        }
                    
        return header;
    }       

    public Archive getArchive()
    {
        return this.archive;
    }
}
