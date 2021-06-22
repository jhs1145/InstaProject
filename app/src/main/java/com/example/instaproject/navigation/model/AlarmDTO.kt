package com.example.instaproject.navigation.model

data class AlarmDTO(
    var destinationUid : String? = null,
    var userId : String? = null,
    var uid : String? = null,

    //0 : like alarm
    //1 : comment alarm
    //2 : follow alarm
    // 어떤 타입의 메세지 종류인지.
    var kind : Int? = null,
    var message : String? = null,
    var timestamp : Long? = null
)