/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author trees
 */
public class StatusUser {
    public enum Code{ZERO,ONE, TWO, THREE}
    public enum Details{REJECTED,PENDING,PROCESSING,APPROVED,NOT_A_VALID_CODE};
    private Code c;
    
    public StatusUser(Code c, Details s){
        this.c=c;
        this.s=s;
    }
    

    public Code getC() {
        return c;
    }

    public void setC(Code c) {
        this.c = c;
    }

    public Details getS() {
        return s;
    }

    public void setS(Details s) {
        this.s = s;
    }
    private Details s;
}
