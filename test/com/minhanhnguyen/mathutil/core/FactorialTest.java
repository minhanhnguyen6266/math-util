/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minhanhnguyen.mathutil.core;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Admin
 */
public class FactorialTest {
    
    @Test  // viết code dùng để viết code chính MathUtil
           // tên hàm phải nói lên mục đích của việc test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        // tui kì vọng khi gọi hàm tính 5! thì máy trả về 120
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(expected, actual);
        
        //đừng quên còn nhiều tình huống/test case xài hàm
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));  
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(6, MathUtil.getFactorial(3));
    }
    
    @Test (expected = IllegalArgumentException.class)
          // biến hàm này thành public static void main(){...}
          // đây là cú pháp/quy tắc của bộ thư viện JUnit
    public void checkFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(22);
        MathUtil.getFactorial(23);
    }
    // âm kh tính giai thừa
    // >= 21 thì tràn long => kh tính
    // 2 tình huống này kh có value trả về nên kh so sánh được
    // kh assertEquals() so sánh coi có bằng kh
}

// Xanh đỏ quy ước: 
// Hàm đánh giá là XANH nếu tất cả các tình huống test phải xanh
// Test gì thì XANH nấy, tức là test gì, thì expected = actual;
// Ám chỉ hàm xử lý đúng

// Chỉ cần 1 cái ĐỎ, cặp EXPECTED != ACTUAl có nghĩa là hàm xử lý kh đúng
// hoặc bạn kì vọng sai

// Ta cần xem lại code/test để đảm bảo xanh hết, kết luận hàm ổn
// cho các tình huống đã test
