package com.ibm.cn.lk;

import java.lang.annotation.Annotation;

public class Client {     
    public static void main(String[] args) {  
        //����ͨ��I/O�������������ð���  
        String pkgName = "com.ibm.cn.lk";          
        Package pkg = Package.getPackage(pkgName);
        
        //��ð��ϵ�ע��  
        Annotation[] annotations = pkg.getAnnotations();
        
        //����ע������  
        for(Annotation an:annotations){  
            if(an instanceof PkgAnnotation){  
                System.out.println("Hi,I'm the PkgAnnotation");  
                /* 
                 * ע����� 
                 * MyAnnotation myAnn = (PkgAnnotation)an; 
                 * �����Բ�����ע����µ������࣬�����ʼ�������ȵ� 
                 * ����Struts��@Namespace�����Էŵ������ϣ�����һ������namespace·�� 
                 */           
            }  
        }  
    }  
}  
