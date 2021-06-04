/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package our_pro;

/**
 *
 * @author top
 */
public class Preprocessing {
    int i;
    String pro,pro_without_com = "";
    public void preprocessing(){  
    }
    public String without_com(String program){
        for(i=0;i<program.length();i++){
            if(i<=program.length()-3 && program.charAt(i)=='/'&&program.charAt(i+1)=='/'&&program.charAt(i+2)=='/'){
               while(i<program.length() && program.charAt(i)!='\n'){
                     i=i+1;
               }
               i=i-1;
            }
            else if(i<=program.length()-1 && program.charAt(i)=='/'&&program.charAt(i+1)=='-'){
                i=i+2;
               while(i<program.length() && program.charAt(i)!='/'){
                     i=i+1;
                     if(program.charAt(i)=='\n')
                         pro_without_com+='\n';
               }
               
            }
            else{
                pro_without_com+=program.charAt(i);
            }
            
           
        }
        
        return pro_without_com;
    }
    
}