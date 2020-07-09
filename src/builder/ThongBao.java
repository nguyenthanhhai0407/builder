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
//b1:khai bao lop
public class ThongBao {
    String cpu, ram, ssd, hdd,screen;
    
 //b3:constructor khong tham so

    public ThongBao(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.hdd = builder.hdd;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "ThongBao{" + "cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + ", hdd=" + hdd + ", screen=" + screen + '}';
    }
 
    
    
    
    
    //b2:khai bao lop builder 
 public static class Builder
   {
    String cpu, ram, ssd, hdd,screen;
    private static Builder intance;
    
    protected Builder() {
        }
    public static Builder CreateIntance() {
        
        if(intance == null) {
            intance = new Builder();
        }
        return intance;
    }

        public Builder addcpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder addram(String ram){
            this.ram = ram; 
            return this;
        }
        public Builder addssd(String ssd){
            this.ssd = ssd;
            return this;
        }
        public Builder addhdd(String hdd){
            this.hdd = hdd;
            return this;
        }
        public Builder addscreen(String screen){
            this.screen = screen;
            return this;
        }
         //b4:khai bao phuong thuc build
         
         public ThongBao build(){
             return new ThongBao(this);
         }
    
     }
}

