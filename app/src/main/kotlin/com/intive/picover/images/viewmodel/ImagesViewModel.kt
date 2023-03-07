package com.intive.picover.images.viewmodel

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.storage.FirebaseStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImagesViewModel @Inject constructor() : ViewModel() {
	private val storageRef = FirebaseStorage.getInstance().reference.child("image/spock.jpg")

	private val _imageUri = MutableLiveData<Uri>()
	val imageUri: LiveData<Uri> = _imageUri

	init {
		storageRef.downloadUrl.addOnSuccessListener { uri ->
			_imageUri.value = uri
		}
	}
}
