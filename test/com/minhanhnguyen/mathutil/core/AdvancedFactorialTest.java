/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.minhanhnguyen.mathutil.core;

import static com.minhanhnguyen.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    // tách toàn bộ data cần test gồm đầu vào/input và expected/output
    // ra 1 chỗ cho dễ quản lý/dễ theo dõi/dễ thống kê đủ các tình huống
    // cần test hay chưa
    
    
    // ta có thể đặt bộ data này ở file txt, csv, excel, database
    @Parameters
    public static Object[][] initData() { // tên hàm tự do
        
        return new Integer[][] {
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720},
                                {0,1}
                               };
    }
        
    // chuẩn bị 2 biến hứng data từ mảng, sau đó thảy vào hàm test
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        assertEquals(expected, getFactorial(input));
    }
    
    
}
