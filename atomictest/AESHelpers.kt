package atomictest

import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

object AESHelpers {
    private const val ALGORITHM = "AES"
    private const val TRANSFORMATION = "AES/CBC/PKCS5Padding"

    fun decryptAES(encryptedData: String, encryptionKey: String, iv: String): String? {
        return try {
            // Decode Base64
            val encryptedBytes = Base64.getDecoder().decode(encryptedData)
            val keyBytes = encryptionKey.toByteArray(Charsets.UTF_8)

            // Ensure key length is 32 bytes for AES-256
            val secretKey = SecretKeySpec(keyBytes.copyOf(32), ALGORITHM)
            val ivBytes =  Base64.getDecoder().decode(iv) ;
            val ivSpec = IvParameterSpec(ivBytes)

            // Initialize Cipher
            val cipher = Cipher.getInstance(TRANSFORMATION)
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec)

            // Perform Decryption
            val decryptedBytes = cipher.doFinal(encryptedBytes)
            String(decryptedBytes, Charsets.UTF_8)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}

fun main() {

    val encryptedText = "g+GihwiG9VxNLljFl68TWuIJTfv8BWmYDHytqRgRNsOJnkTtR+8axNxZ0HXVyKuQHwfioX5VInKq2eN2Px9sdoE+TrSvRAplTIdu4ZvO/s00Y3x4m/kZEvfJHTZn+c+1"
    val encryptionKey = "gPlex#$2244Ict" // Use the exact key from PHP
    val ivGen = "gSl$#QR20#$&25Ic" // IV used in PHP encryption
    val iv = Base64.getEncoder().encodeToString(ivGen.toByteArray(Charsets.UTF_8))

    // Decrypt the data
    val decryptedText = AESHelpers.decryptAES(encryptedText, encryptionKey, iv)
    println("Decrypted Text: $decryptedText")
}
