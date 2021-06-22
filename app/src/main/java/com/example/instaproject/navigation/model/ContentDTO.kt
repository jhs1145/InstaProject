package com.example.instaproject.navigation.model

data class ContentDTO(var explain : String? = null, // 컨텐츠 설명
                      var imageUrl : String? = null, // 이미지 주소
                      var uid : String? = null, // 유저 아이디
                      var userId : String? = null, // 올린 유저의 이미지 관리
                      var timestamp : Long? = null, // 컨텐츠 시간
                      var favoriteCount : Int = 0, // 좋아요 수 관리
                      var favorites : MutableMap<String,Boolean> = HashMap()){ //좋아요 중복 방지
    data class Comment(var uid : String? = null, // 댓글
                       var userId : String? = null,
                       var comment : String? = null,
                       var timestamp : Long? = null)
}