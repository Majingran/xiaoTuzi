package com.example.Base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) {
        String originalData = "test base 64";
        //加密
        String encodedString = Base64.getEncoder().encodeToString(originalData.getBytes());
        System.out.println("Base64加密：" + encodedString);
        //解密
        byte [] bypeData = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(bypeData, StandardCharsets.UTF_8);
        System.out.println("Base64解密：" + decodedString);

        //URL加密
        String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
        byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
        String decodedUrl = new String(decodedBytes);
        System.out.println(decodedUrl);

    }


}
