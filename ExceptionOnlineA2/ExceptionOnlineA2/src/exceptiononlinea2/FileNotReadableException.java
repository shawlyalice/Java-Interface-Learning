/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiononlinea2;

/**
 *
 * @author Asus
 */
public class FileNotReadableException extends Exception{
 
    
    public String fileName;
    
    public FileNotReadableException(String filename)
    {
    this.fileName = filename;
    }
    
    @Override
    public String toString()
    {
    
    String s = fileName + " is not a readable file";
    return s;
    }
    
}

