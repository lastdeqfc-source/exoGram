package com.exteragram.messenger.boost.encryption;

import org.telegram.messenger.MessageObject;

public class EncryptionHelper {
    public static CharSequence[] names = new CharSequence[0]; 
    
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
    
    public static String encryptMessage(String text, long id, int type, EncryptionCallback callback) {
        return text;
    }
    
    public static String encryptMessage(String text, long id, BaseEncryptor enc) { 
        return text; 
    }
    
    public static MessageObject decryptMessage(Object obj, Object g) { 
        return obj instanceof MessageObject ? (MessageObject) obj : null; 
    }
    
    public static MessageObject decryptMessage(Object obj) { 
        return obj instanceof MessageObject ? (MessageObject) obj : null; 
    }
    
    public static boolean isEncrypted(Object obj, Object n) { 
        return false; 
    }
    
    public static boolean isEncrypted(Object obj) { 
        return false; 
    }
}
