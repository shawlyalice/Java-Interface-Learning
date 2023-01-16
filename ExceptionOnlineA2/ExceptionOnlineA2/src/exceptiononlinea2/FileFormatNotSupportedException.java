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
public class FileFormatNotSupportedException extends Exception{
    
    public String readerName;
    public String formatName;
    
    public FileFormatNotSupportedException(String readerName, String formatName)
    {
    this.formatName = formatName;
    this.readerName = readerName;
    }
    
    @Override
    public String toString()
    {
    
    String s = readerName + " cannot open "+ formatName + " format files";
    return s;
    }
    
}
