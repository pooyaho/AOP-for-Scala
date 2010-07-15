package org.aop4scala.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * User: FaKod
 * Date: 15.07.2010
 * Time: 12:23:22
 */

public class AspectBaseForConditionalPointcuts {

    /**
     * creating public static boolean ... method
     * required for conditional pointcuts
     */
    @Pointcut("call(* *.lolli(String)) && args(s) && if() && this(aa)")
    public static boolean conditionalPointcut(String s, AspectBaseForConditionalPointcuts aa) {
        System.out.println("***");
        return aa.pointcutCondition(s);
    }

    boolean pointcutCondition(String s) {
        return true;
    }
}