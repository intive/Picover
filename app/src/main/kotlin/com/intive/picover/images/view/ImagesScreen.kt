package com.intive.picover.images.view

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import com.intive.picover.R
import com.intive.picover.images.viewmodel.ImagesViewModel
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun ImagesScreen(viewModel: ImagesViewModel) {
	val imageUrl by viewModel.imageUri.observeAsState()
	Log.d("BUGHUNT", "the url is $imageUrl")
	Column(
		modifier = Modifier.fillMaxSize(),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(
			text = stringResource(id = R.string.images),
			modifier = Modifier.align(Alignment.CenterHorizontally)
		)
		CoilImage(
			imageModel = {
				imageUrl
			},
			imageOptions = ImageOptions(
				contentScale = ContentScale.Crop,
				alignment = Alignment.Center
			)
		)
	}
}
