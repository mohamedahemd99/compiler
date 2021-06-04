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
public class match {
    int state;
    String lexeme;
    
    public match(){
    }
    public void setLexeme(String word){
       lexeme=word;
    }
    public String checkMatch(){
        int i;
        state=1;
        char ch;
        AcceptState accept=new AcceptState();
        Token token=new Token();
        for(i=0;i<lexeme.length();i++){
            ch=lexeme.charAt(i);
            // the current state is accept state or not
            if(!accept.check()||i<lexeme.length()){
                ReservedWordTrans trans=new ReservedWordTrans(state,ch);
                state=trans.nextState();
            }
            accept.setState(state);
           if(state==0){
                break;
            }
        }
        accept.setState(state);
        if(accept.check()){
           return token.Token_of(lexeme);
        }
        
        //if not a reserved word,check if it's an identifier
        else{ 
            state=1;
            for(i=0;i<lexeme.length();i++){
              ch=lexeme.charAt(i);
              accept.setState(state);
              // the current state is accept state or not
              if(!accept.check()||i<lexeme.length()){
                IdentifierTrans transI=new IdentifierTrans(state,ch);
                state=transI.nextState();
              }
              accept.setState(state);
              if(state==0){
                break;
              }
            }
            accept.setState(state);
            if(accept.check()){
               return "identifier";
            }
        }
        return "error";
    } 
}