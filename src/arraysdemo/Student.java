/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author shirishshahi
 */
public class Student {
    //comment added at 
    //comment at 1:27 PM
    private String sID;
    private String sName;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//comment
    public Student(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }

    // Comment at 1:30 pm
    public String getsID() {
        return sID;
    }
//friday
    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
}
