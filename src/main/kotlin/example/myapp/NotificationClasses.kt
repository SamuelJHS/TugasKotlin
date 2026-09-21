package example.myapp

class EmailNotification(private val emailAddress: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("Mengirim Email ke $emailAddress")
        println("Isi Pesan: $msg\n")
    }
}

class PushNotification(private val deviceToken: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("Mengirim Push Notification ke Token Device: $deviceToken")
        println("Isi Pesan: $msg\n")
    }
}

class SMSNotification(private val phoneNumber: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("Mengirim SMS ke Nomor: $phoneNumber")
        println("Isi Pesan: $msg\n")
    }
}