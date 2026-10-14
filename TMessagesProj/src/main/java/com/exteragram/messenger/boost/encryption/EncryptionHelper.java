package com.exteragram.messenger.boost.encryption;

import org.telegram.messenger.MessageObject;

public class EncryptionHelper {
    // Делаем массив объектов, который сработает везде
    public static Object[] names = new Object[10]; 

    public interface EncryptionCallback {
        void onResult(String message);
    }

    public static BaseEncryptor getEncryptorBy(long id) { 
        return new BaseEncryptor(); 
    }
    
    public static int getEncryptorTypeFor(long id, Object ctx, Object i) { 
        return 0; 
    }
    
    public static int getEncryptorTypeFor(long id) { 
        return 0; 
    }
    
    public static String encryptMessage(String text, long id, int type, Object callback) {
        return text;
    }

    public static String encryptMessage(String text, long id, int type, EncryptionCallback callback) {
        return text;
    }
    
    public static String encryptMessage(String text, long id, Object enc) { 
        return text; 
    }
    
    public static Object decryptMessage(Object obj, Object g) { 
        return obj; 
    }
    
    public static Object decryptMessage(Object obj) { 
        return obj; 
    }
    
    public static boolean isEncrypted(Object obj, Object n) { 
        return false; 
    }
    
    public static boolean isEncrypted(Object obj) { 
        return false; 
    }
}
