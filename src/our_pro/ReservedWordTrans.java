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
public class ReservedWordTrans {
    public int state,next;
    public char c;
    public ReservedWordTrans(int s,char l){
        state=s;
        c=l;
    } 
    public int nextState(){
        //Omw
        if(c=='O' && state==1){
            next=2;
        }
        else if(c=='m' && state==2){
            next=3;
        }
       else if(c=='w' && state==3){
            next=4;
        }
       //OutLoop
       else if(c=='u' && state==2){
            next=5;
        }
        else if(c=='t' && state==5){
            next=6;
        }
       else if(c=='L' && state==6){
            next=7;
        }
        else if(c=='o' && state==7){
            next=8;
        }
       else if(c=='o' && state==8){
            next=9;
        }
        else if(c=='p' && state==9){
            next=10;
        }
        //Otherwise
       else if(c=='t' && state==2){
            next=11;
        }
       
       else if(c=='h' && state==11){
            next=12;
        }
       
       else if(c=='e' && state==12){
            next=13;
        }
        else if(c=='r' && state==13){
            next=14;
        }
       else if(c=='w' && state==14){
            next=15;
        }
        else if(c=='i' && state==15){
            next=16;
        }
       else if(c=='s' && state==16){
            next=17;
        }
        else if(c=='e' && state==17){
            next=18;
        }
        //Yesif
       else if(c=='Y' && state==1){
            next=19;
        }
        else if(c=='e' && state==19){
            next=20;
        }
       else if(c=='s' && state==20){
            next=21;
        }
       else if(c=='i' && state==21){
            next=22;
        }
       else if(c=='f' && state==22){
            next=18;
        }
       //Chji
       else if(c=='C' && state==1){
            next=23;
        }
       else if(c=='h' && state==23){
            next=24;
        }
       else if(c=='j' && state==24){
            next=25;
        }
       else if(c=='i' && state==25){
            next=26;
        }
       //Start
       else if(c=='S' && state==1){
            next=27;
        }
       else if(c=='t' && state==27){
            next=28;
        }
       else if(c=='a' && state==28){
            next=29;
        }
       else if(c=='r' && state==29){
            next=30;
        }
       else if(c=='t' && state==30){
            next=31;
        }
       //Seriestl
       else if(c=='e' && state==27){
            next=32;
        }
       else if(c=='r' && state==32){
            next=33;
        }
       else if(c=='i' && state==33){
            next=34;
        }
       else if(c=='e' && state==34){
            next=35;
        }
       else if(c=='s' && state==35){
            next=36;
        }
       else if(c=='t' && state==36){
            next=37;
        }
       else if(c=='l' && state==37){
            next=38;
        }
       //SIMww
       else if(c=='I' && state==27){
            next=39;
        }  
       else if(c=='M' && state==39){
            next=40;
        }
       else if(c=='w' && state==40){
            next=41;
        }  
       else if(c=='w' && state==41){
            next=42;
        }  
       //SIMwf
       else if(c=='f' && state==41){
            next=43;
        }
       //Include
       else if(c=='I' && state==1){
            next=44;
        }
       else if(c=='n' && state==44){
            next=45;
        }
       else if(c=='c' && state==45){
            next=46;
        }
       else if(c=='l' && state==46){
            next=47;
        }
       else if(c=='u' && state==47){
            next=48;
        }
       else if(c=='d' && state==48){
            next=49;
        }
       else if(c=='e' && state==49){
            next=50;
        }
       //IMwf
       else if(c=='M' && state==44){
            next=51;
        }
       else if(c=='w' && state==51){
            next=52;
        }
        else if(c=='f' && state==52){
            next=53;
        }
        //GetBack
       else if(c=='G' && state==1){
            next=55;
        }
        else if(c=='e' && state==55){
            next=56;
        }
       else if(c=='t' && state==56){
            next=57;
        }
       
       else if(c=='B' && state==57){
            next=58;
        }
       
       else if(c=='a' && state==58){
            next=59;
        }
       else if(c=='c' && state==59){
            next=60;
        }
       
       else if(c=='k' && state==60){
            next=61;
        }
       //Reiterate
       else if(c=='R' && state==1){
            next=62;
        }
        else if(c=='e' && state==62){
            next=63;
        }
       else if(c=='i' && state==63){
            next=64;
        }
        else if(c=='t' && state==64){
            next=65;
        }
       else if(c=='e' && state==65){
            next=66;
        }
       
       else if(c=='r' && state==66){
            next=67;
        }
       
       else if(c=='a' && state==67){
            next=68;
        }
       
       else if(c=='t' && state==68){
            next=69;
        }
       
       else if(c=='e' && state==69){
            next=70;
        }
        //RepeatWhen
        else if(c=='p' && state==63){
            next=86;
        }
        else if(c=='e' && state==86){
            next=87;
        }
        else if(c=='a' && state==87){
            next=88;
        }
        else if(c=='t' && state==88){
            next=89;
        }
        else if(c=='W' && state==89){
            next=90;
        }

        else if(c=='h' && state==90){
            next=91;
        }

        else if(c=='e' && state==91){
            next=92;
        }

        else if(c=='n' && state==92){
            next=93;
        }
        //NOReturn
        else if(c=='N' && state==1){
            next=71;
        }
        else if(c=='O' && state==71){
            next=72;
        }
       else if(c=='R' && state==72){
            next=73;
        }
       else if(c=='e' && state==73){
            next=74;
        }
        else if(c=='t' && state==74){
            next=75;
        }
       else if(c=='u' && state==75){
            next=76;
        }
        else if(c=='r' && state==76){
            next=77;
        }
       else if(c=='n' && state==77){
            next=78;
        }
       //Loli
       else if(c=='L' && state==1){
            next=79;
        }
       else if(c=='o' && state==79){
            next=80;
        }
       else if(c=='l' && state==80){
            next=81;
        }
       else if(c=='i' && state==81){
            next=82;
        }
       //Last
       else if(c=='a' && state==79){
            next=83;
        }
       else if(c=='s' && state==83){
            next=84;
        }
       else if(c=='t' && state==84){
            next=85;
        }
        //-
        else if(c=='-' && state==1){
            next=112;
        }
        //->
        else if(c=='>' && state==112){
            next=115;
        }
        //+
        else if(c=='+' && state==1){
            next=116;
        }
        //*
        else if(c=='*' && state==1){
            next=116;
        }
        // /
        else if(c=='/' && state==1){
            next=106;
        }
        // /^
        else if(c=='^' && state==106){
            next=141;
        }
        // /@
        else if(c=='@' && state==106){
            next=141;
        }
        // @/
        else if(c=='@' && state==1){
            next=138;
        }
        else if(c=='/' && state==138){
            next=141; 
        }
        //&&
        else if(c=='&' && state==1){
            next=117;
        }
       else if(c=='&' && state==117){
            next=127;
        }
        //||
       else if(c=='|' && state==1){
            next=121;
        }
        else if(c=='|' && state==121){
            next=127;
        }
        //~
       else if(c=='~' && state==1){
            next=127;
        }
        //=
        else if(c=='=' && state==1){
            next=128;
        }
        //==
       else if(c=='=' && state==128){
            next=137;
        }
       //<
       else if(c=='<' && state==1){
            next=130;
        }
        //<=
       else if(c=='=' && state==130){
            next=137;
        }
        //>
       else if(c=='>' && state==1){
            next=132;
        }
        //>=
       else if(c=='=' && state==132){
            next=137;
        }
       //!=
       else if(c=='!' && state==1){
            next=134;
        }
       else if(c=='=' && state==134){
            next=137;
        }
        //$
       else if(c=='$' && state==1){
            next=143;
        } 
        //.
        else if(c=='.' && state==1){
            next=145;
        }
        //"
        else if(c=='\"' && state==1){
            next=148;
        }
        // '
        else if(c=='"' && state==1){
            next=148;
        }
        //[
        else if(c=='[' && state==1){
            next=155;
        }
        //]
        else if(c==']' && state==1){
            next=155;
        }
         //(
        else if(c=='(' && state==1){
            next=155;
        }
         //)
        else if(c==')' && state==1){
            next=155;
        } 
        //{
        else if(c=='{' && state==1){
            next=155;
        }
         //}
        else if(c=='}' && state==1){
            next=155;
        }
              
       //constant
       else if(c>='0'&&c<='9' && state==1){
            next=300;
        }
       else if(c>='0'&&c<='9'  && state==300){
            next=301;
        }
       else if(c>='0'&&c<='9' && state==301){
            next=302;
        }
       else if(c>='0'&&c<='9' && state==302){
            next=303;
        }
       else if(c>='0'&&c<='9'  && state==303){
            next=304;
        }
       else if(c>='0'&&c<='9' && state==304){
            next=305;
        }
       else{
           next=0;
       }
        return next;
    }
}