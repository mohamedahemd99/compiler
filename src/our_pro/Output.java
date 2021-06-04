/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package our_pro;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Output {
    static String  line="";
   static String lexeme="";    
  static int i,j,lineCtr=1,errorCtr=0;
   static ArrayList<String> scannerOutput =new ArrayList<>();
  
     
    //constructor
    public void Output(){
    }
    public int getTotalErrors ()
    {
        return this.errorCtr;
        
    }
    
    //split the program to lines
    public void splitProg(String program){
        line="";
        lexeme="";
        i=0;j=0;lineCtr=1;errorCtr=0;
        for(i=0;i<program.length();i++){
            if(program.charAt(i)!='.'&&program.charAt(i)!='\n'){
                line+=program.charAt(i);
            }
            else if(program.charAt(i)=='.'){
                splitLine(line,lineCtr);
                lineCtr++;
                line="";
            }
        }
        //the last line
        if(line!=""){
            splitLine(line,lineCtr);
        }
         scannerOutput.add("Total NO of errors: "+errorCtr);
    }
    
    //split the line to word
    public static void splitLine(String line,int lineCtr){
        lexeme="";
        int counter=0 ;
        match matchLex=new match();
        Token to = new Token();
        String token , token1,token2;
        for(j=0;j<line.length();j++){
            if(line.charAt(j)!='$'){
                lexeme+=line.charAt(j);
            }
                         
            else if(lexeme!=""){
                
                matchLex.setLexeme(lexeme);
                token=matchLex.checkMatch();
                token1=to.Token_of("$");
                if(token!="error"){
                    counter++;
                     scannerOutput.add("Line#:("+lineCtr+")    Token Text:   "+lexeme+"   Token Type:    "+token + "    Lexeme NO in Line :   " + counter+"     Matched" );
                     scannerOutput.add("Line#:("+lineCtr+")    Token Text:   "+ "$   "+token1 + "  Lexeme NO in Line :   " + ++counter +"     Matched");
                }
                else{
                    scannerOutput.add("Line#: ("+lineCtr+")    Error in token text:    "+lexeme + "     NotMatched");
                    errorCtr++;
                }
                lexeme="";
            }
        }
        //the last word in the line
        if(lexeme!=""){
            counter++;
            matchLex.setLexeme(lexeme);
            token=matchLex.checkMatch();
            if(token!="error"){
                  scannerOutput.add("Line#:("+lineCtr+")   Token Text:   "+lexeme+"   Token Type:   "+token +"    Lexeme NO in Line :    " + counter + "     Matched");
            }
            else{
                 scannerOutput.add("Line#:("+lineCtr+")    Error in token text:    "+lexeme + "     NotMatched" );
                errorCtr++;
            }
            lexeme="";
        }
    }
}