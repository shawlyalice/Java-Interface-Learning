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
public class PDFReader extends Reader{
    
    public PDFReader(String readername)
    {
    super(readername);
    }
    @Override
    public void readFile(String fileName) throws FileFormatNotSupportedException,FileNotReadableException {
        
        if(fileName.endsWith(".doc")|| fileName.endsWith(".docx"))
            
            throw new FileFormatNotSupportedException(this.readername, fileName);
        else if(fileName.endsWith(".pdf")|| fileName.endsWith(".epub")|| fileName.endsWith(".djvu"))
        
            System.out.println(this.readername+" is reading "+fileName);
        else 
            throw new FileNotReadableException(fileName);
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editFile(String fileName) throws FileFormatNotSupportedException,FileNotReadableException{
    
            if(fileName.endsWith(".doc")|| fileName.endsWith(".docx"))
    
        throw new FileFormatNotSupportedException(this.readername, fileName);
            else if(fileName.endsWith(".pdf")|| fileName.endsWith(".epub")|| fileName.endsWith(".djvu"))
     
            System.out.println(this.readername+" is editing "+fileName);
        else 
            throw new FileNotReadableException(fileName);
        

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
