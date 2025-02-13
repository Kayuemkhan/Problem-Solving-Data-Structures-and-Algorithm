package chiper

import atomictest.AESHelper
import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

private  val ALGORITHM = "AES"
private  val TRANSFORMATION = "AES/CBC/PKCS5Padding"


fun decryptAES(encryptedTexts: String, encryptionKey: String): String? {
    return try {
        // Decode the base64 encoded encrypted data
        val encryptedByted = Base64.getDecoder().decode(encryptedTexts)
//        val keyBytes = encryptionKey.toByteArray(Charsets.UTF_8).copyOf(32)

        // Determine the IV length from the Cipher's block size (16 bytes for AES)
        val ivLength = Cipher.getInstance(TRANSFORMATION).blockSize
        val ivByted = encryptedByted.copyOfRange(0, ivLength)

        println("ivBytes" + String(ivByted))
        val iv64 = Base64.getEncoder().encode(ivByted);
        val iv = String(iv64)

        println(iv)

        val cipherBytes = encryptedByted.copyOfRange(ivLength, encryptedByted.size)

        println("cipherBytes")
        val encryptedText = String(Base64.getEncoder().encode(cipherBytes))
        println(encryptedText)


        // Initialize the Cipher for decryption
        val cipher = Cipher.getInstance(TRANSFORMATION)

        val encryptedBytes = Base64.getDecoder().decode(encryptedText)
        val keyBytes = encryptionKey.toByteArray(Charsets.UTF_8)

        // Ensure key length is 32 bytes for AES-256
        val secretKey = SecretKeySpec(keyBytes.copyOf(32), ALGORITHM)
        val ivBytes =  Base64.getDecoder().decode(iv) ;
        val ivSpec = IvParameterSpec(ivBytes)

        // Initialize Cipher
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec)

        // Perform Decryption
        val decryptedBytes = cipher.doFinal(encryptedBytes)
        String(decryptedBytes, Charsets.UTF_8)





    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun main() {
    // Encrypted data (base64 encoded)
    val encryptedText = "FFFJLnnWidgno5dAMkkAV0lIY1E4dTlTR3JRUTBLczMrVEd4ODl5N0MzY1p5RXMxR2JqVDJFU2lBY3lDYlV3YUx6MHV2Ri9KZVlIZFFtSnd3MjZVeU1yQVFocnNoak9TRlduMHp5dTJ2NEgxb3JtNzNZVkpRZ2ptdlNzPQ=="
    val encryptionKey = "gplex$#23@567$#QR20#$&25"

    // Decrypt the data
    val decryptedText = decryptAES(encryptedText, encryptionKey)
    println("Decrypted Text: $decryptedText")
}
