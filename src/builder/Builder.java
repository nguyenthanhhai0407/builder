/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author HaiNguyen
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThongBao thongbao = new ThongBao.Builder().CreateIntance()
                .addcpu("CPU VIP")
                .addram("8GB")
                .addssd("120GB")
                .addhdd("12GB")
                .addscreen("Full hd").build();
        System.out.println(thongbao.toString());
    }
    
}
