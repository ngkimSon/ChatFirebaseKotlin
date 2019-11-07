package com.sean.chat.util

import com.google.firebase.auth.FirebaseAuth

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.sean.chat.model.User
import java.lang.NullPointerException

object StorageUtil {
    private val storegeInstance: FirebaseStorage by lazy { FirebaseStorage.getInstance() }
//    private val currentUserRef: StorageReference
//        get() = storegeInstance.referencey
}