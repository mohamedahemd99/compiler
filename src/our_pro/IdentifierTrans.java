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
public class IdentifierTrans {
    int state,next;
    char c;
    public IdentifierTrans(int s,char l){
        state=s;
        c=l;
    }
    public int nextState(){
        if(c>='a' && c<='z' && state==1){
            next=201;
        }
        else if( c>='A' && c<='Z' && state==1){
            next=201;
        }
         else if( c=='_'&& state==1){
            next=201;
        }
        else if( c>='a' && c<='z' && state==201){
            next=201;
        }
        else if( c>='A' && c<='Z' && state==201){
            next=201;
        }
        
        else if( c>='0' && c<='9' && state==201){
            next=201;
        }
          else if( c>='_' && state==201){
            next=201;
        } 
        else if( c>='0' && c<='9' && state==1){
            next=202;
        }
        else if( c>='0' && c<='9' && state==202){
            next=202;
        }
         else if( c>='.' && state==202){
            next=203;
        }
        else if( c>='0' && c<='9' && state==203){
            next=203;
        }
        else{
           next=0;
       }
        return next;
    }
}