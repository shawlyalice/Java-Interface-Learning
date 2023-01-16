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
abstract public class Reader {
    
    public String readername;
    
    public Reader(String readername)
    {
    this.readername = readername;
    }
    
    abstract public void readFile(String fileName) throws FileFormatNotSupportedException,FileNotReadableException;
    abstract public void editFile(String fileName) throws FileFormatNotSupportedException,FileNotReadableException;;
    
    
}
