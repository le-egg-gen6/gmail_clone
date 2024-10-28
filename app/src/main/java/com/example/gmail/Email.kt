package com.example.gmail



data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview,date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails():MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "test"
        preview = "test"
        date = "26 jun"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "chaythu"
        preview = "chay"
        date = "25 jun"
        stared = true
    },
    email {
        user = "Twitter"
        subject = "Notification"
        preview = "thong bao"
        date = "24 jun"
        stared = false
        unread = true
    },
    email {
        user = "RiotGames"
        subject = "dang ky"
        preview = "chuc mung ban da do"
        date = "23 jun"
        stared = true
    },
    email {
        user = "danglol240"
        subject = "Confirm trung tuyen"
        preview = "trung tuyen"
        date = "23 feb"
        stared = false
    },
    email {
        user = "nhat huy"
        subject = "nhac nho"
        preview = "lam bai tap"
        date = "22 jun"
        stared = true
    },
    email {
        user = "huyduoc@gmail"
        subject = "Hola"
        preview = "form dang ky"
        date = "21 jun"
        stared = false
        unread = true
    },
    email {
        user = "ngocle@sis.hust"
        subject = "xinchao"
        preview = "chao mung ban den voi hust "
        date = "16 jun"
        stared = true
    } ,
    email {
        user = "dungvinhbao"
        subject = "thu cam on"
        preview = "cam on vi da ho tro "
        date = "16 jun"
        stared = true
    },
    email {
        user = "hunganh"
        subject = "xinchao"
        preview = "chao mung ban den voi CLB"
        date = "16 jun"
        stared = true
    }
)