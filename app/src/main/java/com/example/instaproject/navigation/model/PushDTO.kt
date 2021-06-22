package com.example.instaproject.navigation.model

data class PushDTO(
    var userEmailID : String? = null,
    var fcmToken : String? = null,
    // push 받는 사람 토큰 id
    var to : String? = null,
    var notification : Notification = Notification()
){
    data class Notification(
        // push message 제목과 내용
        var body : String? = null,
        var title : String? = null
    )
}