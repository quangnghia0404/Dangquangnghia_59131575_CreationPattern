/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;


/**
 *
 * @author Laptop
 */
public class bt1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       HoaDonHeader hd = new HoaDonHeader("MS01","26/09/2020", "Đặng Quang Nghĩa");
       CTHD cthd1 = new CTHD("Trứng", 30, 5000, 0.5);
       CTHD cthd2 = new CTHD("Cá", 20, 16000, 0.3);
       
        HoaDon HD = new HoaDon.Builder()
              .addHoaDonHeader(hd)
              .addCTHD(cthd1)
              .addCTHD(cthd2)  
              .build();
        System.out.println(HD.toString());
    }
    
}
