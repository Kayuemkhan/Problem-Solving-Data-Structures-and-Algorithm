package atomictest
import java.security.SecureRandom
import java.util.Base64

import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

object AESHelper {
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
    val encryptedText = "ODEIIdbVei7+FpG3qbpLyJgVYmgvkRyd6xD4mOw0PTf6WZkge8wVeCfPEG4AXxDfR30Cgoo+/j9zR4xe4bQHh68pZooBGSACL/G2ug4sU8c="
    val encryptionKey = "gPlex#$2244Ict" // Use the exact key from PHP
    val iv = "gSl$#QR20#$&25Ic" // IV used in PHP encryption
// Base64 encode the IV if it's not already
    val ivEncoded = Base64.getEncoder().encodeToString(iv.toByteArray(Charsets.UTF_8))

    println("Base64 IV: $ivEncoded") // For debugging
    val decryptedText = AESHelper.decryptAES(encryptedText, encryptionKey, ivEncoded)
    println("Decrypted Text: $decryptedText")


}