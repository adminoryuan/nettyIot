package org.example.entity;

import lombok.Data;
import lombok.ToString;

@Data
public class RequestHeaderFrame  {
     final byte[] frameHeader = { (byte) 0xAA, (byte) 0xBB };
     byte frameType;
     short dataLength;
     long longitude;
     long latitude;
     byte[] cabinetId=new byte[16];
     byte[] data;
     int checksum;


}
