/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiononlinea2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class ExceptionOnlineA2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        try {
            DocReader microSoftWord = new DocReader("MicroSoft Word");
            PDFReader foxitReader = new PDFReader("Foxit Reader");
            
            //microSoftWord.readFile("some.djvu");
            microSoftWord.readFile("some.doc");
            //microSoftWord.editFile("some.dj");
            //microSoftWord.editFile("some.docx");
            
            //foxitReader.readFile("some.djvu");
            //foxitReader.readFile("some.doc");
            //foxitReader.editFile("some.pdf");
            //foxitReader.editFile("some.docx");
            
            
            
            // TODO code application logic here
        } catch (FileFormatNotSupportedException ex) {
            System.out.println(ex);

//        Logger.getLogger(ExceptionOnlineA2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotReadableException ex) {
System.out.println(ex);      
//      Logger.getLogger(ExceptionOnlineA2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
