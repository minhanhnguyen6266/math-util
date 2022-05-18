package com.minhanhnguyen.mathutil.main;

import com.minhanhnguyen.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        //test bằng tay, manual testing 
        //MathUtil.getFactorial(-5);
        System.out.println("0!: 1? " + MathUtil.getFactorial(0));
        System.out.println("1!: 1? " + MathUtil.getFactorial(1));
        System.out.println("2!: 2? " + MathUtil.getFactorial(2));
        System.out.println("5!: 120? " + MathUtil.getFactorial(5));
        // muốn thấy xh ngoại lệ hay không thì cứ gọi để xem app bị giết hay kh
        
    }
}
