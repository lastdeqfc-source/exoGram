package com.exteragram.messenger.boost.encryption;

public class EncryptionHelper {
    public static String names = "";
    
    public static BaseEncryptor getEncryptorBy(long id) { 
        return new BaseEncryptor(); 
    }
    
    public static int getEncryptorTypeFor(long id) { 
        return 0; 
    }
    
    public static String decryptMessage(Object obj, Object g) { 
        return ""; 
    }
    
    public static String decryptMessage(Object obj) { 
        return ""; 
    }
    
    public static boolean isEncrypted(Object obj, Object n) { 
        return false; 
    }
    
    public static boolean isEncrypted(Object obj) { 
        return false; 
    }
}
