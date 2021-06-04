/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package our_pro;

import java.util.HashMap;

/**
 *
 * @author top
 */
public class Token {
    String Lex ;
    public static HashMap<String, String> Dic = new HashMap<String, String>();
    public Token(){}
    static {
       // Add keys and values
        Dic.put("Yesif", "Condition");
        Dic.put("Otherwise", "Condition");
        Dic.put("Omw", "Integer");
        Dic.put("SIMww", "SInteger");
        Dic.put("Chji", "Character");
        Dic.put("Seriestl", "String");
        Dic.put("IMwf", "Float");
        Dic.put("SIMwf", "SFloat");
        Dic.put("NOReturn", "Void");
        Dic.put("RepeatWhen", "Loop");
        Dic.put("Reiterate", "Loop");
        Dic.put("GetBack", "Return");
        Dic.put("OutLoop", "Break");
        Dic.put("Loli", "Struct");
        Dic.put("+", "Arithmetic Operation");
        Dic.put("-", "Arithmetic Operation");
        Dic.put("*", "Arithmetic Operation");
        Dic.put("/", "Arithmetic Operation");
        Dic.put("&&", "Logic operators");
        Dic.put("||", "Logic operators");
        Dic.put("~", "Logic operators");
        Dic.put("==", "relational operators");
        Dic.put(">", "relational operators");
        Dic.put("<", "relational operators");
        Dic.put("<=", "relational operators");
        Dic.put(">=", "relational operators");
        Dic.put("!=", "relational operators");
        Dic.put("=", "Assignment operator");
        Dic.put("->", "Access Operator");
        Dic.put("{", "Braces");
        Dic.put("}", "Braces");
        Dic.put("[", "Braces");
        Dic.put("]", "Braces");
        Dic.put("(", "Braces");
        Dic.put(")", "Braces");
        Dic.put("'", "Quotation Mark");
        Dic.put("\"", "Quotation Mark");
        Dic.put("/@", "Comment");
        Dic.put("@/", "Comment");
        Dic.put("/^", "Comment");
        Dic.put("$", "Token Delimiter");
        Dic.put(".", "Line Delimiter");
        Dic.put("Start", "start");
        Dic.put("Last", "End");
    }
    
    public String Token_of(String lexeme){
        Lex=lexeme;
        if(Dic.get(Lex)==null)
            return "Contsant";
        return Dic.get(Lex);
    }
}