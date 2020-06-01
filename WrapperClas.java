/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO;

/**
 *
 * @author Anisa Fadilah
 */
public class WrapperClas {
    public static void main(String[] args){
        Character objChar = new Character('D');
        Byte objByte = new Byte("10");
        Short objShort = new Short("50");
        Integer objInteger = new Integer(800);
        Long objlLong = new Long(1000);
        Boolean objBoolean = new Boolean(true);
        Float objFloat = new Float(82.89);
        Double objDouble = new Double(34.67);
        
        //menampilkan output dari class wrapper
        System.err.println("Character: "+objChar);
        System.err.println("Byte: "+objByte);
        System.err.println("Short: "+objShort);
        System.err.println("Integer: "+objInteger);
        System.err.println("Long: "+objlLong);
        System.err.println("Boolean: "+objBoolean);
        System.err.println("Flot: "+objFloat);
        System.err.println("Double: "+objDouble);
        
    }
}
