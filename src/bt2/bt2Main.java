/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Laptop
 */
public class bt2Main  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder mySB = new MyStringBuilder.Builder()
                .addString("Tôi yêu các bạn"+";")
                .addFloat((float)0.5)
                .addBool(true)
                .build();
        System.out.println(mySB.toString());
    }
    
}
