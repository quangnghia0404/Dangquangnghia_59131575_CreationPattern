/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class HoaDon {
    HoaDonHeader HDH;
    ArrayList<CTHD> DSHD = new ArrayList<>();
    
    protected HoaDon(Builder builder){
        this.HDH = builder.HDH;
        this.DSHD = builder.DSHD;
    }

    @Override
    public String toString() {
        String s = HDH.toString();
        for(int i =0; i<DSHD.size(); i++){
            s+="\n"+DSHD.get(i).toString();
        }
        return s;
    }
    
    public static class Builder{
        HoaDonHeader HDH;
        ArrayList<CTHD> DSHD = new ArrayList<>(); 

        public Builder() {
        }
    
        public Builder addHoaDonHeader(HoaDonHeader HDH){
        this.HDH = HDH;
        return this;
        }
        
        public Builder addCTHD(CTHD cthd){
            this.DSHD.add(cthd);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }
}
