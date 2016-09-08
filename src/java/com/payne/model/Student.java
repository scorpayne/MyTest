/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.model;

/**
 *
 * @author Administrator
 */
public class Student{
    private int age;
    
    public Student(){
        
    }
    
    public Student(int age){
        this.age = age;
    }
    
    public StatusModel<String> speak(String words) throws BusinessException {
        if ("你好".equals(words)) {
            return StatusModel.successFastRet("hello");
        }else if("我爱你".equals(words)) {
            if(age<10){
                throw new BusinessException("小学生别乱说话！",BusinessException.OBJECT_NO_FOUND);
            }else{
                return StatusModel.successFastRet("I love you");
            }
        }else if("有点意思".equals(words)){
            return StatusModel.successFastRet("哦摸希诺已");
        }else{
            return StatusModel.errorFastRet("不知道说什么");
        }
    }
    
    public String say(String words) throws BusinessException{
        if(!"你好".equals(words)){
            throw new BusinessException("招呼都不打？",BusinessException.OBJECT_NO_FOUND);
        }
        return "SUCCESS";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
