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
public class AcceptState {
    int state;
    int a[]={4,10,18,26,31,38,42,43,50,53,61,70,78,82,85,93,112,115,116,106,141,127,128,130,132,137,143,145,148,155,201,202,203,301,302,303,304,300,305};
    public AcceptState(){
    }
    public void setState(int s){
        this.state=s;
    }
    public boolean check(){
        int i;
        for(i=0;i<=38;i++){
            if(state==a[i])
            { 
                return true;
            }
        }
    return false;
}
    
}