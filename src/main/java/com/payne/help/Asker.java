/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.help;

/**
 *
 * @author Administrator
 */
//调用者   寻求帮助
public class Asker {
    //拥有一个帮助的接口，这是寻求帮助的人和给予帮助的人之间的约定，符合这个约定你就能获取帮助了哦
    public HelperInterface hi;

    public void setHi(HelperInterface hi) {
        this.hi = hi;
    }

    public void sos(){
        this.hi.rescue();
    }
}
