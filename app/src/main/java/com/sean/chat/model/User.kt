package com.sean.chat.model

data class User(
    val name: String,
    val bio: String,
    val profilePicturePath: String?
) {
    constructor() : this("", "", null)
}