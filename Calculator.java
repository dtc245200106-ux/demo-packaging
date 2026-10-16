package com.codegym;

import java.security.NoSuchAlgorithmException;

/**
 * Thư viện tiện ích Calculator cung cấp các phép toán cơ bản.
 * Đây là class được đóng gói thành file .jar để tái sử dụng.
 */
public class Calculator {

    /**
     * Cộng hai số nguyên.
     * @param a số hạng 1
     * @param b số hạng 2
     * @return a + b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Trừ hai số nguyên.
     * @param a số bị trừ
     * @param b số trừ
     * @return a - b
     */
    public static int sub(int a, int b) {
        return a - b;
    }

    /**
     * Nhân hai số nguyên.
     * @param a thừa số 1
     * @param b thừa số 2
     * @return a * b
     */
    public static int mul(int a, int b) {
        return a * b;
    }

    /**
     * Chia hai số nguyên.
     * @param a số bị chia
     * @param b số chia
     * @return a / b
     * @throws NoSuchAlgorithmException nếu b == 0
     */
    public static int divide(int a, int b) throws NoSuchAlgorithmException {
        if (b == 0) {
            throw new NoSuchAlgorithmException();
        }
        return a / b;
    }
}