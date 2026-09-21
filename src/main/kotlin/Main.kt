package example.myapp

fun main() {
    println("=== SIMULASI SISTEM NOTIFIKASI APLIKASI MOBILE ===\n")

    // 1. Objek Email Notification
    val emailService: NotificationAction = EmailNotification("mahasiswa.informatika@univ.ac.id")
    emailService.sendNotification("Kode OTP verifikasi aplikasi mobile Anda adalah: 4829")

    // 2. Objek Push Notification
    val pushService: NotificationAction = PushNotification("fcm_token_xyz123_android_phone")
    pushService.sendNotification("Diskon 50% khusus pengguna baru hari ini! Klik di sini.")

    // 3. Objek SMS Notification
    val smsService: NotificationAction = SMSNotification("081234567890")
    smsService.sendNotification("Pulsa Anda hampir habis!")
}