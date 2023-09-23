package org.example.utls;

public final class CheckSumUtls {
    public static int CheckSum(byte[] data) {
        // 在实际应用中，你应该使用更强大的校验和算法
        int checksum = 0;
        for (byte b : data) {
            checksum += b;
        }
        return checksum;
    }

}
