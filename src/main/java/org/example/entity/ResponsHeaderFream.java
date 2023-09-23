package org.example.entity;

import lombok.Data;

/**
 * 响应数据头部帧
 */
@Data
public class ResponsHeaderFream {
    final byte[] frameHeader = { (byte) 0xAA, (byte) 0xBB };
    byte frameType;
    short dataLength;
    byte[] data;
    int checksum;
}
