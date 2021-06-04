/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package our_pro;
import java.io.*;
/**
 *
 * @author 
 */
public class FileManagement {
        int i;
        String str,line;
        String program="",program2="",editedString;
    public String ReadFile(String path) throws Exception{
            FileReader fr = 
            new FileReader(path);
            while ((i=fr.read()) != -1){
                program+=(char) i;
            }
            editedString=editString(program);
            return editedString;
           
    }
            
    private String editString(String program){
        for(i=0;i<program.length()-1;i++){
            if(program.charAt(i+1)!='\n'){
                program2+=program.charAt(i);
            }
        }
        if(program.charAt(program.length()-1)!='\n'){
             program2+=program.charAt(program.length()-1);
        }
        return program2;
    }
}